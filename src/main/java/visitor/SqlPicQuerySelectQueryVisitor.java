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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class SqlPicQuerySelectQueryVisitor extends picsqlBaseVisitor<Value> {

    public static final String NO_ALIAS = "<no_alias>";
    public static final String AND = "and";
    public static final String OR = "or";
    public static final String EQUALS = "=";
    public static final String NOT_EQUALS = "!=";
    public static final String LESSER_THAN = "<";
    public static final String GREATER_THAN = ">";
    public static final String LESSER_THAN_EQUALS = "<=";
    public static final String GREATER_THAN_EQUALS = ">=";
    public static final String MIN = "min";
    public static final String MAX = "max";
    public static final String LEAD = "lead";
    public static final String LAG = "lag";
    public static final String SIN = "sin";
    public static final String COS = "cos";
    public static final String TAN = "tan";
    public static final String STAR = "*";
    public static final String PI = "pi()";
    public static final String RAND = "rand()";

    private SqlFields sqlFields;
    private PicsManager picsManager  = new PicsManager();

    public SqlPicQuerySelectQueryVisitor() {
    }

    private DoubleValue getField(String field) {
        return new DoubleValue(sqlFields.getField(field));
    }

    public int getNumberOfFames(picsqlParser.QueryContext ctx){
        picsqlParser.SelectstmtContext selectstmt = ctx.selectstmt();
        AtomicInteger frameRate = new AtomicInteger();
        selectstmt.from_source_list().forEach(
                s -> {
                    picsqlParser.Pic_pathContext pic_pathContext = s.pic_path();
                    if(pic_pathContext != null){
                        if(pic_pathContext.DIGITS() != null && pic_pathContext.DIGITS().size() == 1){
                            frameRate.set(Integer.parseInt(pic_pathContext.DIGITS(0).getText()));
                        }
                    }
                }
        );
        return frameRate.get();
    }

    public List<BufferedImage> visitQueryMultipleTimes(picsqlParser.QueryContext ctx, int frameRate) {
        List<BufferedImage> images = new ArrayList<>();
        for (int i = 0; i < frameRate; i++) {
            picsManager = new PicsManager();
            setCurrentFrame(i);
            BufferedImage value = ((PictureValue) visitSelectstmt(ctx.selectstmt())).getValue();
            images.add(value);
        }
        return images;
    }

    @Override
    public Value visitSelectstmt(picsqlParser.SelectstmtContext ctx) {
        ctx.from_source_list().forEach(
                s -> {
                    Value value = visitFrom_source_list(s);
                    if (value instanceof PictureValue image) {
                        picsManager.putPic(
                                image.getId(),
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
                    int finalR = toFinalValue(newR);
                    int finalG = toFinalValue(newG);
                    int finalB = toFinalValue(newB);
                    newImage.setRGB(x, y, new Color(finalR, finalG, finalB).getRGB());
                }
                rank++;
            }
        }

        return new PictureValue(newImage, null, ctx.getText());
    }

    private int toFinalValue(Double value){
        if (value < 0) {
            value = 0.0;
        }
        if (value > 255) {
            value = 255.0;
        }
        return (int) Math.round(value);
    }

    @Override
    public Value visitSingle_field(picsqlParser.Single_fieldContext ctx) {
        DoubleValue childValue = null;
        ParseTree child = ctx.getChild(0);
        // If it's not a column ref...
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
        // Always null, we have raw no decimal text here.
        if (childValue == null) {
            childValue = getField(ctx.getText());
        }
        return childValue;
    }

    @Override
    public Value visitNegate_single_field(picsqlParser.Negate_single_fieldContext ctx) {
        Value value = this.visitSingle_field(ctx.single_field());
        if (value instanceof DoubleValue) {
            return new DoubleValue(((DoubleValue) value).getValue() * -1);
        }
        return new NullValue();
    }

    @Override
    public Value visitMask_conv(picsqlParser.Mask_convContext ctx) {

        List<picsqlParser.SelectionContext> selections = ctx.mask_conv_vals().selection();

        SqlFields oldSqlFields = this.sqlFields;

        int x = sqlFields.getX();
        int y = sqlFields.getY();
        double value = 0.0;
        for (int i = 0;i < selections.size(); i++) {
            picsqlParser.SelectionContext selectionContext = selections.get(i);
            this.sqlFields = new SqlFields(x + (i % 3) - 1, y + (i % 3) - 1, this.sqlFields.getRank(), picsManager);
            value += ((DoubleValue) selectionContext.accept(this)).getValue();
        }
        this.sqlFields = oldSqlFields;
        return new DoubleValue(value / 9);
    }

    @Override
    public Value visitFlip_function(picsqlParser.Flip_functionContext ctx) {
        SqlFields oldSqlFields = this.sqlFields;

        int x = sqlFields.getX();
        int y = sqlFields.getY();
        int width = sqlFields.getWidth();
        int height = sqlFields.getHeight();

        int newX = x;
        int newY = y;

        if((ctx.X() != null || ctx.XY() != null) && x > (width) / 2){
            newX = width - x;
        }
        if((ctx.Y() != null || ctx.XY() != null) && y > (height) / 2){
            newY = height - y;
        }

        this.sqlFields = new SqlFields(newX, newY, this.sqlFields.getRank(), picsManager);

        Double value = ((DoubleValue) ctx.selection().accept(this)).getValue();

        this.sqlFields = oldSqlFields;
        return new DoubleValue(value);
    }

    @Override
    public Value visitDiscr_function(picsqlParser.Discr_functionContext ctx) {
        Double value = ((DoubleValue) ctx.selection(0).accept(this)).getValue();
        Double buckets = ((DoubleValue) ctx.selection(1).accept(this)).getValue();
        return new DoubleValue(Math.ceil((value*buckets)/255)* (255/buckets));
    }

    @Override
    public Value visitZero_param_function(picsqlParser.Zero_param_functionContext ctx) {
        String text = ctx.getText();
        double result;
        switch (text) {
            case RAND:
                result = Math.random();
                break;
            case PI:
                result = Math.PI;
                break;
            case STAR:
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
            case SIN -> new DoubleValue(Math.sin(singleField.getValue()));
            case COS -> new DoubleValue(Math.cos(singleField.getValue()));
            case TAN -> new DoubleValue(Math.tan(singleField.getValue()));
            default -> null;
        };
    }

    @Override
    public Value visitThree_params_function(picsqlParser.Three_params_functionContext ctx) {
        picsqlParser.Alias_dotContext alias_dotContext = ctx.alias_dot();
        String field = ctx.alias_value().getText();

        picsqlParser.SelectionContext selection1 = ctx.selection(0);
        picsqlParser.SelectionContext selection2 = ctx.selection(1);
        int singleField1 = ((DoubleValue) visitSelection(selection1)).getValue().intValue();
        int singleField2 = ((DoubleValue) visitSelection(selection2)).getValue().intValue();

        final int x = sqlFields.getX();
        final int y = sqlFields.getY();
        String tableName  = alias_dotContext != null && alias_dotContext.STR().getText() != null ? alias_dotContext.STR().getText() : picsManager.getLastNoAlias();
        return switch (ctx.getChild(0).getText()) {
            case LAG -> new DoubleValue(sqlFields.getXYAtPosition(tableName, field, x - singleField1, y - singleField2));
            case LEAD -> new DoubleValue(sqlFields.getXYAtPosition(tableName, field, x + singleField1, y + singleField2));
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
                    case MIN -> result = Math.min(val.getValue(), result);
                    case MAX -> result = Math.max(val.getValue(), result);
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
            return new PictureValue(selectImage.getValue(), picsManager.generateAlias(ctx.alias().getText()), ctx.alias().getText());
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

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setPaint(color);
        graphics.fillRect(0, 0, width, height);

        return new PictureValue(image, picsManager.generateAlias(ctx.alias() == null ? null : ctx.alias().getText()), null);
    }

    @Override
    public Value visitPic_path(picsqlParser.Pic_pathContext ctx) {
        try {
            BufferedImage image = null;
            String path = ctx.path().getText();
            File input = new File(path);
            String picId = "";

            int numValues = ctx.DIGITS().size();
            int value1 = 0;
            if(numValues > 0){
                value1 = Integer.parseInt(ctx.DIGITS(0).getText());
            }
            if(numValues > 1){
                int value2 = Integer.parseInt(ctx.DIGITS(1).getText());
                if(numValues == 2){
                    picId = path + "-" + value1 + "-" + value2;
                    BufferedImage cachedImage = picsManager.getPicFromPath(picId);
                    if(cachedImage != null){
                        image =  cachedImage;
                    } else {
                        image = getBufferedImage(path, value1, value2);
                        picsManager.addPic(picId, image);
                    }
                }else if(numValues == 4){
                    int value3 = Integer.parseInt(ctx.DIGITS(2).getText());
                    int value4 = Integer.parseInt(ctx.DIGITS(3).getText());

                    picId = path + "-" + value1 + "-" + value2 + "-" + value3 + "-" + value4;
                    BufferedImage cachedImage = picsManager.getPicFromPath(picId);
                    if(cachedImage != null){
                        image = cachedImage;
                    } else {
                        Rectangle sourceRegion = new Rectangle(
                                value1,
                                value2,
                                value3,
                                value4
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
                        picsManager.addPic(picId, image);
                    }
                }
            }else{
                picId = path;
                BufferedImage cachedImage = picsManager.getPicFromPath(path);
                if(cachedImage == null){
                    image = ImageIO.read(input);
                } else {
                    image = cachedImage;
                    picsManager.addPic(path, image);
                }
            }
            return new PictureValue(image, picsManager.generateAlias(ctx.alias() == null ? null : ctx.alias().getText()), picId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new NullValue();
    }

    private BufferedImage getBufferedImage(String path, int width, int height) throws IOException {
        BufferedImage image;
        BufferedImage toClone = ImageIO.read(new File(path));
        image = new BufferedImage(toClone.getWidth()* width, toClone.getHeight()* height, toClone.getType());
        Graphics g = image.getGraphics();
        for(int i = 0; i  < width; i++){
            for(int j = 0; j  < height; j++){
                g.drawImage(toClone, i*toClone.getWidth(), j*toClone.getHeight(), null);
            }
        }
        g.dispose();
        return image;
    }

    @Override
    public Value visitBool_expression(picsqlParser.Bool_expressionContext ctx) {
        if (ctx.selection().size() == 2) {
            Double field1 = getDoubleValueFromBoolExpr(ctx, 0);
            Double field2 = getDoubleValueFromBoolExpr(ctx, 1);

            return new BoolValue(switch (ctx.OPERATOR_CONDITION().getText()) {
                case EQUALS -> Objects.equals(field1, field2);
                case NOT_EQUALS -> !Objects.equals(field1, field2);
                case LESSER_THAN -> field1 < field2;
                case GREATER_THAN -> field1 > field2;
                case LESSER_THAN_EQUALS -> field1 <= field2;
                case GREATER_THAN_EQUALS -> field1 >= field2;
                default -> false;
            });
        }
        return super.visitBool_expression(ctx);
    }

    private Double getDoubleValueFromBoolExpr(picsqlParser.Bool_expressionContext ctx, int selection) {
        return ((DoubleValue) visitSelection(ctx.selection(selection))).getValue();
    }

    @Override
    public Value visitWhere_clause(picsqlParser.Where_clauseContext ctx) {
        if (ctx.where_clause().size() == 2) {
            Boolean whereCondition = ((BoolValue) this.visitWhere_clause(ctx.where_clause(0))).getValue();
            Boolean value = ((BoolValue) this.visitWhere_clause(ctx.where_clause(1))).getValue();
            switch (ctx.OPERATOR_LOGIC().getText()) {
                case AND:
                    return new BoolValue(whereCondition && value);
                case OR:
                    return new BoolValue(whereCondition || value);
            }
        } else if (ctx.where_clause().size() == 1) {
            return visitWhere_clause(ctx.where_clause(0));
        } else {
            return visitBool_expression(ctx.bool_expression());
        }
        return super.visitWhere_clause(ctx);
    }

    public void setCurrentFrame(int frameNumber) {
        this.picsManager.setCurrentFrame(frameNumber);
    }
}

