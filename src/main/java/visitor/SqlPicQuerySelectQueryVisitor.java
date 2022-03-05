package visitor;

import grammar.picsqlBaseVisitor;
import grammar.picsqlParser;
import model.PicsManager;
import model.SqlFields;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.value.BoolValue;
import visitor.value.DoubleValue;
import visitor.value.NullValue;
import visitor.value.PictureValue;
import visitor.value.Value;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class SqlPicQuerySelectQueryVisitor extends picsqlBaseVisitor<Value> {

    public static final String NO_ALIAS = "<no_alias>";
    private SqlFields sqlFields;

    public SqlPicQuerySelectQueryVisitor() {
    }

    private DoubleValue getField(String field) {
        return new DoubleValue(sqlFields.getField(field));
    }

    @Override
    public Value visitSelectstmt(picsqlParser.SelectstmtContext ctx) {
        PicsManager picsManager = new PicsManager();

        ctx.from_source_list().forEach(
                s -> {
                    Value value = visitFrom_source_list(s);
                    if (value instanceof PictureValue image) {
                        picsManager.putPic(
                                image.getAlias(),
                                image.getValue()
                        );
                    }
                }
        );
        int width = picsManager.getWidth();
        int height = picsManager.getHeight();
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int rank = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                this.sqlFields = new SqlFields(x, y, rank, picsManager);

                picsqlParser.Where_clauseContext whereClause = ctx.where_clause();
                if (whereClause == null || ((BoolValue) visitWhere_clause(whereClause)).getValue()) {
                    List<Double> selections = ctx.selectionlist()
                            .selection()
                            .stream()
                            .map(s -> ((DoubleValue) visitSelection(s)).getValue())
                            .toList();

                    Double newR = 0.0;
                    Double newG = 0.0;
                    Double newB = 0.0;

                    if (selections.size() >= 1) {
                        newR = selections.get(0);
                    }
                    if (selections.size() >= 2) {
                        newG = selections.get(1);
                    }
                    if (selections.size() >= 3) {
                        newB = selections.get(2);
                    }
                    if (newR < 0) {
                        newR = 0.0;
                    }
                    if (newG < 0) {
                        newG = 0.0;
                    }
                    if (newB < 0) {
                        newB = 0.0;
                    }
                    if (newR > 255) {
                        newR = 255.0;
                    }
                    if (newG > 255) {
                        newG = 255.0;
                    }
                    if (newB > 255) {
                        newB = 255.0;
                    }
                    int finalR = (int) Math.round(newR);
                    int finalG = (int) Math.round(newG);
                    int finalB = (int) Math.round(newB);
                    newImage.setRGB(x, y, new Color(finalR, finalG, finalB).getRGB());
                }
                rank++;
            }
        }

        return new PictureValue(newImage, null);
    }

    @Override
    public Value visitSingle_field(picsqlParser.Single_fieldContext ctx) {
        DoubleValue childValue = null;
        ParseTree child = ctx.getChild(0);
        if (ctx.col_value() == null) {
            childValue = (DoubleValue) child.accept(this);
        }
        // Get raw decimal value
        if (childValue == null) {
            try {
                childValue = new DoubleValue(Double.parseDouble(child.getText()));
            } catch (Exception ignored) {
            }
        }
        // Always null, we have raw non decimal text here.
        if (childValue == null) {
            childValue = getField(ctx.getText());
        }
        return childValue;
    }

    @Override
    public Value visitZero_param_function(picsqlParser.Zero_param_functionContext ctx) {
        String text = ctx.getText();
        double result;
        switch (text) {
            case "rand()":
                result = Math.random();
                break;
            case "pi()":
                result = Math.PI;
                break;
            case "*":
                result = -1d;
                break;
            default:
                try {
                    result = Double.parseDouble(text);
                } catch (Exception e) {
                    return getField(ctx.getText());
                }
        }
        return new DoubleValue(result);
    }

    @Override
    public Value visitOne_params_function(picsqlParser.One_params_functionContext ctx) {
        DoubleValue singleField = (DoubleValue) visitSelection(ctx.selection());

        return switch (ctx.getChild(0).getText()) {
            case "sin" -> new DoubleValue(Math.sin(singleField.getValue()));
            case "cos" -> new DoubleValue(Math.cos(singleField.getValue()));
            case "tan" -> new DoubleValue(Math.tan(singleField.getValue()));
            default -> null;
        };
    }

    @Override
    public Value visitThree_params_function(picsqlParser.Three_params_functionContext ctx) {
        picsqlParser.Alias_dotContext alias_dotContext = ctx.alias_dot();
        String tableName;
        if (alias_dotContext == null) {
            tableName = NO_ALIAS;
        } else {
            tableName = alias_dotContext.STR().getText();

        }
        String field = ctx.alias_value().getText();

        final int x = sqlFields.getField("x").intValue();
        final int y = sqlFields.getField("y").intValue();

        picsqlParser.SelectionContext selection1 = ctx.selection(0);
        picsqlParser.SelectionContext selection2 = ctx.selection(1);
        int singleField1 = ((DoubleValue) visitSelection(selection1)).getValue().intValue();
        int singleField2 = ((DoubleValue) visitSelection(selection2)).getValue().intValue();

        return switch (ctx.getChild(0).getText()) {
            case "lag" -> new DoubleValue(sqlFields.getXYAtPosition(tableName, field, x - singleField1, y - singleField2));
            case "lead" -> new DoubleValue(sqlFields.getXYAtPosition(tableName, field, x + singleField1, y + singleField2));
            default -> null;
        };
    }

    @Override
    public Value visitMultiple_params_function(picsqlParser.Multiple_params_functionContext ctx) {
        Double result = null;
        String functionName = ctx.getChild(0).getText();

        for (picsqlParser.SelectionContext s : ctx.selection()) {
            DoubleValue val = (DoubleValue) visitSelection(s);
            if (result == null) {
                result = val.getValue();
            } else {
                switch (functionName) {
                    case "min" -> result = Math.min(val.getValue(), result);
                    case "max" -> result = Math.max(val.getValue(), result);
                }
            }
        }
        return new DoubleValue(result);
    }

    @Override
    public Value visitSelection(picsqlParser.SelectionContext ctx) {
        if (ctx.single_field() != null) {
            return visitSingle_field(ctx.single_field());
        } else if (ctx.selection().size() == 1) {
            return this.visitSelection(ctx.selection(0));
        }
        if (ctx.selection().size() == 2) {
            picsqlParser.SelectionContext selection1 = ctx.selection(0);
            picsqlParser.SelectionContext selection2 = ctx.selection(1);
            Value sel1 = visitSelection(selection1);
            Value sel2 = visitSelection(selection2);
            if (sel1 instanceof DoubleValue && sel2 instanceof DoubleValue) {
                double sel1Val = ((DoubleValue) sel1).getValue();
                double sel2Val = ((DoubleValue) sel2).getValue();
                Double result = null;
                if (ctx.STAR() != null) {
                    result = sel1Val * sel2Val;
                } else if (ctx.DIVIDE() != null) {
                    result = sel1Val / sel2Val;
                } else if (ctx.PLUS() != null) {
                    result = sel1Val + sel2Val;
                } else if (ctx.MODULO() != null) {
                    result = sel1Val % sel2Val;
                } else if (ctx.MINUS() != null) {
                    result = sel1Val - sel2Val;
                }
                return new DoubleValue(result);
            }
        }
        return super.visitSelection(ctx);
    }

    @Override
    public Value visitFrom_source_list(picsqlParser.From_source_listContext ctx) {
        if (ctx.from_pic_source() != null) {
            return visitFrom_pic_source(ctx.from_pic_source());
        } else if (ctx.pic_path() != null) {
            return visitPic_path(ctx.pic_path());
        } else if (ctx.subquery() != null) {
            return visitSubquery(ctx.subquery());
        }
        return super.visitFrom_source_list(ctx);
    }

    @Override
    public Value visitSubquery(picsqlParser.SubqueryContext ctx) {
        Value value = visitSelectstmt(ctx.selectstmt());
        if (value instanceof PictureValue selectImage) {
            return new PictureValue(selectImage.getValue(), ctx.alias() == null ? null : ctx.alias().getText());
        } else if (value instanceof DoubleValue) {
            // TODO
        } else if (value instanceof BoolValue) {
            // TODO
        }
        return new NullValue();
    }

    @Override
    public Value visitFrom_pic_source(picsqlParser.From_pic_sourceContext ctx) {
        int width = Integer.parseInt(ctx.DIGITS(0).getText());
        int height = Integer.parseInt(ctx.DIGITS(1).getText());
        Color color = new Color(Integer.parseInt(ctx.DIGITS(2).getText()), Integer.parseInt(ctx.DIGITS(3).getText()), Integer.parseInt(ctx.DIGITS(4).getText()));
        String alias = ctx.alias() == null ? null : ctx.alias().getText();

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setPaint(color);
        graphics.fillRect(0, 0, width, height);
        if (alias == null) {
            alias = NO_ALIAS;
        }
        return new PictureValue(image, alias);
    }

    @Override
    public Value visitPic_path(picsqlParser.Pic_pathContext ctx) {
        try {
            BufferedImage image = null;
            File input = new File(ctx.path().getText());

            if(ctx.DIGITS().size() > 0){
                Rectangle sourceRegion = new Rectangle(
                        Integer.parseInt(ctx.DIGITS(0).getText()),
                        Integer.parseInt(ctx.DIGITS(1).getText()),
                        Integer.parseInt(ctx.DIGITS(2).getText()),
                        Integer.parseInt(ctx.DIGITS(3).getText())
                );

                ImageInputStream stream = ImageIO.createImageInputStream(input);
                Iterator<ImageReader> readers = ImageIO.getImageReaders(stream);
                if (readers.hasNext()) {
                    ImageReader reader = readers.next();
                    reader.setInput(stream);

                    ImageReadParam param = reader.getDefaultReadParam();
                    param.setSourceRegion(sourceRegion);

                    image = reader.read(0, param);
                }
            }else{
                image = ImageIO.read(input);
            }
            String alias;
            if (ctx.alias() == null) {
                alias = NO_ALIAS;
            } else {
                alias = ctx.alias().getText();
            }
            return new PictureValue(image, alias);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new NullValue();
    }

    @Override
    public Value visitBool_expression(picsqlParser.Bool_expressionContext ctx) {
        if (ctx.selection().size() == 2) {
            Double field1 = ((DoubleValue) visitSelection(ctx.selection(0))).getValue();
            Double field2 = ((DoubleValue) visitSelection(ctx.selection(1))).getValue();

            return new BoolValue(switch (ctx.OPERATOR_CONDITION().getText()) {
                case "=" -> Objects.equals(field1, field2);
                case "!=" -> !Objects.equals(field1, field2);
                case "<" -> field1 < field2;
                case ">" -> field1 > field2;
                case "<=" -> field1 <= field2;
                case ">=" -> field1 >= field2;
                default -> false;
            });
        }
        return super.visitBool_expression(ctx);
    }

    @Override
    public Value visitWhere_clause(picsqlParser.Where_clauseContext ctx) {
        if (ctx.where_clause().size() == 2) {
            Boolean whereCondition = ((BoolValue) this.visitWhere_clause(ctx.where_clause(0))).getValue();
            Boolean value = ((BoolValue) this.visitWhere_clause(ctx.where_clause(1))).getValue();
            switch (ctx.OPERATOR_LOGIC().getText()) {
                case "and":
                    return new BoolValue(whereCondition && value);
                case "or":
                    return new BoolValue(whereCondition || value);
            }
        } else if (ctx.where_clause().size() == 1) {
            return visitWhere_clause(ctx.where_clause(0));
        } else {
            return visitBool_expression(ctx.bool_expression());
        }
        return super.visitWhere_clause(ctx);
    }
}