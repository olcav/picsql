package model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SqlFields {

    public static final String NO_ALIAS = "<no_alias>";
    public static final String X = "x";
    public static final String Y = "y";
    public static final String RANK = "rank()";
    public static final String R = "r";
    public static final String G = "g";
    public static final String B = "b";
    public static final String T = "t";

    private final Map<String, Double> fieldsByName = new HashMap<>();
    private final PicsManager picsManager;

    public SqlFields(int x, int y, int rank, PicsManager picsManager) {
        this.picsManager = picsManager;
        fieldsByName.put(X, (double) x);
        fieldsByName.put(Y, (double) y);
        fieldsByName.put(RANK, (double) rank);
        fieldsByName.put(T, (double)picsManager.getCurrentFrame());

        for (Map.Entry<String, BufferedImage> entry : picsManager.getPicsByAliases().entrySet()) {
            String alias = entry.getKey();
            if (alias.startsWith(NO_ALIAS)) {
                alias = "";
            } else {
                alias += ".";
            }
            Color c = getColor(entry.getValue(), x, y);
            fieldsByName.put(alias + R, (double) c.getRed());
            fieldsByName.put(alias + G, (double) c.getGreen());
            fieldsByName.put(alias + B, (double) c.getBlue());
        }
    }

    public Double getXYAtPosition(String tableName, String field, int x, int y) {
        BufferedImage image = picsManager.getPicFromAlias(Objects.requireNonNullElse(tableName, NO_ALIAS));
        Color color = getColor(image, x, y);
        return switch (field) {
            case R -> (double) color.getRed();
            case G -> (double) color.getGreen();
            case B -> (double) color.getBlue();
            default -> null;
        };
    }

    public Color getColor(BufferedImage image, int x, int y){
        Color c = Color.BLACK;
        if (x >= 0 && y >= 0 && x < image.getWidth() && y < image.getHeight()) {
            c = new Color(image.getRGB(x, y));
        }
        return c;
    }

    public Double getField(String name) {
        return fieldsByName.get(name);
    }

    public int getX(){
        return getField(SqlFields.X).intValue();
    }

    public int getY(){
        return getField(SqlFields.Y).intValue();
    }

    public int getRank(){
        return getField(SqlFields.RANK).intValue();
    }

    public int getWidth(){
        return picsManager.getWidth();
    }

    public int getHeight(){
        return picsManager.getHeight();
    }
}
