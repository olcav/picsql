package model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SqlFields {

    public static final String NO_ALIAS = "<no_alias>";
    private final Map<String, Double> fieldsByName = new HashMap<>();
    private final PicsManager picsManager;

    public SqlFields(int x, int y, int rank, PicsManager picsManager) {
        this.picsManager = picsManager;
        fieldsByName.put("x", (double) x);
        fieldsByName.put("y", (double) y);
        fieldsByName.put("rank()", (double) rank);
        fieldsByName.put("t", (double)picsManager.getCurrentFrame());

        for (Map.Entry<String, BufferedImage> entry : picsManager.getPicsByAliases().entrySet()) {
            String alias = entry.getKey();
            if (alias.startsWith(NO_ALIAS)) {
                alias = "";
            } else {
                alias += ".";
            }
            Color c = getColor(entry.getValue(), x, y);
            fieldsByName.put(alias + "r", (double) c.getRed());
            fieldsByName.put(alias + "g", (double) c.getGreen());
            fieldsByName.put(alias + "b", (double) c.getBlue());
        }
    }

    public Double getXYAtPosition(String tableName, String field, int x, int y) {
        BufferedImage image = picsManager.getPicFromAlias(Objects.requireNonNullElse(tableName, NO_ALIAS));
        Color color = getColor(image, x, y);
        return switch (field) {
            case "r" -> (double) color.getRed();
            case "g" -> (double) color.getGreen();
            case "b" -> (double) color.getBlue();
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
}
