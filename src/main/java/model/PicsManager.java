package model;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class PicsManager {

    private Map<String, BufferedImage> pics = new HashMap<>();

    public PicsManager(){}

    public void putPic(String alias, BufferedImage pic){
        pics.put(alias, pic);
    }

    public Map<String, BufferedImage> getPics() {
        return pics;
    }

    public BufferedImage getPic(String name){
        return pics.get(name);
    }
}
