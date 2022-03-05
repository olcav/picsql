package visitor.value;

public class BoolValue extends Value<Boolean> {

  private Boolean boolData;

  public BoolValue(Boolean boolData) {
    this.boolData = boolData;
  }

  @Override
  public Boolean getValue() {
    return boolData;
  }
}
