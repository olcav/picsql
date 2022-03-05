package visitor.value;

import java.awt.image.BufferedImage;

import static model.SqlFields.NO_ALIAS;

public class PictureValue extends Value<BufferedImage> {
  private BufferedImage image;
  private String alias;

  public PictureValue(BufferedImage image, String alias) {
    this.image = image;
    this.alias = alias;
  }

  public String getAlias() {
    return alias == null ? NO_ALIAS : alias;
  }

  @Override
  public BufferedImage getValue() {
    return this.image;
  }
}
