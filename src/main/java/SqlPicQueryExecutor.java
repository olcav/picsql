import grammar.picsqlParser;
import model.*;
import visitor.SqlPicQuerySelectionVisitor;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static model.SqlFields.NO_ALIAS;

public class SqlPicQueryExecutor {

    public SqlPicQueryExecutor() {
        super();
    }

    public void execute(SqlPicQuery sqlPicQuery, String newFile, String newFileFormat) {
        PicsManager picsManager = new PicsManager();
        int width = 0;
        int height = 0;
        for (PicPath img : sqlPicQuery.getPics()) {
            try {
                BufferedImage read = ImageIO.read(new File(img.picPath()));
                String alias = img.alias();
                if(alias == null){
                    alias = "<no_alias>";
                }
                picsManager.putPic(alias, read);
                if (read.getWidth() > width) {
                    width = read.getWidth();
                }
                if (read.getHeight() > height) {
                    height = read.getHeight();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (PicSource img : sqlPicQuery.getPicSources()) {
            BufferedImage image = new BufferedImage(img.width(), img.height(),BufferedImage.TYPE_INT_RGB);
            Graphics2D  graphics = image.createGraphics();
            graphics.setPaint ( img.c() );
            graphics.fillRect ( 0, 0, img.width(),img.height() );
            String alias = img.alias();
            if(alias == null){
                alias = NO_ALIAS;
            }
            if (image.getWidth() > width) {
                width = image.getWidth();
            }
            if (image.getHeight() > height) {
                height = image.getHeight();
            }
            picsManager.putPic(alias, image);
        }
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        ArrayList<picsqlParser.SelectionContext> selections = sqlPicQuery.getSelections();

        int rank = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                SqlFields sqlFields = new SqlFields(x, y, rank, picsManager);
                rank++;
                if (sqlPicQuery.validWhere(sqlFields)) {
                    SqlPicQuerySelectionVisitor sqlSelectionVisitor = new SqlPicQuerySelectionVisitor(sqlFields);

                    List<Double> selectionValues = selections.stream().map(sqlSelectionVisitor::visitSelection).toList();

                    Double newR = 0.0;
                    Double newG = 0.0;
                    Double newB = 0.0;

                    boolean star = selectionValues.size() == 1 && selectionValues.get(0) == -1;

                    if (star) {
                        // TODO : rework star operator
                        //newR = sqlFields.;
                        //newG = green;
                       // newB = blue;
                    } else {
                        if (selectionValues.size() >= 1) {
                            newR = selectionValues.get(0);
                        }
                        if (selectionValues.size() >= 2) {
                            newG = selectionValues.get(1);
                        }
                        if (selectionValues.size() >= 3) {
                            newB = selectionValues.get(2);
                        }
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
            }
        }
        try {
            ImageIO.write(newImage, newFileFormat, new File(newFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
