package model;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toMap;
import static visitor.SqlPicQuerySelectQueryVisitor.NO_ALIAS;

public class PicsManager {

  private Map<String, BufferedImage> picsByPath = new HashMap<>();
  private Map<String, String> aliasByPath = new HashMap<>();
  private int width, height;
  private int frameRate = 0;
  private int currentFrame = 0;

  public PicsManager() {}

  public void putPic(String path, String alias, BufferedImage pic) {
    if (pic.getWidth() > width) {
      width = pic.getWidth();
    }
    if (pic.getHeight() > height) {
      height = pic.getHeight();
    }
    if (!picsByPath.containsKey(path)) {
      picsByPath.put(path, pic);
    }
    if (!aliasByPath.containsKey(path)) {
      aliasByPath.put(path, alias);
    }
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public Map<String, BufferedImage> getPicsByAliases() {
    return picsByPath.entrySet().stream()
        .collect(toMap(entry -> aliasByPath.get(entry.getKey()), Map.Entry::getValue));
  }

  public BufferedImage getPicFromAlias(String alias) {
    Optional<Map.Entry<String, String>> findedEntry =
        aliasByPath.entrySet().stream().filter(entry -> entry.getValue().equals(alias)).findFirst();
    if (findedEntry.isPresent()) {
      String pathFromAlias = findedEntry.get().getKey();
      return getPicFromPath(pathFromAlias);
    } else {
      System.out.println("Image not found !" + alias);
      System.out.println("Current aliases : " + aliasByPath);
      return null;
    }
  }

  public BufferedImage getPicFromPath(String id) {
    return picsByPath.get(id);
  }

  public void addPic(String id, BufferedImage image) {
    if (image != null) {
      picsByPath.put(id, image);
    }
  }

  private int countNoAlias = 0;

  public String generateAlias(String text) {
    String alias = text;
    if (alias == null) {
      alias = NO_ALIAS + "_" + countNoAlias;
      countNoAlias++;
    }
    return alias;
  }

  public String getLastNoAlias() {
    return NO_ALIAS + "_" + (countNoAlias - 1);
  }

  public void setFrameRate(int frameRate) {
    this.frameRate = frameRate;
  }

  public int getFrameRate() {
    return frameRate;
  }

  public void setCurrentFrame(int currentFrame) {
    this.currentFrame = currentFrame;
  }

  public int getCurrentFrame() {
    return currentFrame;
  }
}
