import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SqlFields {

    private Map<String, Double> fieldsByName = new HashMap<>();

    public SqlFields(int x, int y, int rank, PicsManager picsManager) {
        fieldsByName.put("x", (double)x);
        fieldsByName.put("y", (double)y);
        fieldsByName.put("rank()", (double) rank);

        for(Map.Entry<String, BufferedImage> entry : picsManager.getPics().entrySet()){
            String alias = entry.getKey();
            if(Objects.equals(alias, "<no_alias>")){
                alias = "";
            }else{
                alias += ".";
            }
            BufferedImage value = entry.getValue();
            Color c = Color.BLACK;
            if(x < value.getWidth() && y < value.getHeight()){
                c = new Color(value.getRGB(x,y));
            }
            fieldsByName.put(alias + "r", (double)c.getRed());
            fieldsByName.put(alias + "g", (double)c.getGreen());
            fieldsByName.put(alias + "b", (double)c.getBlue());
        }
    }

    public Double getFieldValueFromName(String singleFieldValue){
        if(Objects.equals(singleFieldValue, "rand()")){
            return Math.random();
        }
        if(Objects.equals(singleFieldValue, "*")){
            return -1d;
        }
        try {
            return Double.parseDouble(singleFieldValue);
        } catch (Exception e) {
            return getField(singleFieldValue);
        }
    }
    public Double getField(String name){
        return fieldsByName.get(name);
    }
}
