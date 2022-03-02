package model;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static visitor.SqlPicQuerySelectQueryVisitor.NO_ALIAS;

public class PicsManager {

    private Map<String, BufferedImage> pics = new HashMap<>();
    private int width, height;

    public PicsManager(){}

    public void putPic(String alias, BufferedImage pic){
        if (pic.getWidth() > width) {
            width = pic.getWidth();
        }
        if (pic.getHeight() > height) {
            height = pic.getHeight();
        }
        pics.put(alias, pic);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Map<String, BufferedImage> getPics() {
        return pics;
    }

    public BufferedImage getPic(String name){
        return pics.get(name);
    }

}
