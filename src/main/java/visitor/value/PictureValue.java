package visitor.value;

import java.awt.image.BufferedImage;

import static model.SqlFields.NO_ALIAS;

public class PictureValue extends Value<BufferedImage> {
  private final BufferedImage image;
  private final String alias;
  private final String id;

  public PictureValue(BufferedImage image, String alias, String id) {
    this.image = image;
    this.alias = alias;
    this.id = id;
  }

  public String getAlias() {
    return alias == null ? NO_ALIAS : alias;
  }

  public String getId() {
    return id;
  }

  @Override
  public BufferedImage getValue() {
    return this.image;
  }
}
