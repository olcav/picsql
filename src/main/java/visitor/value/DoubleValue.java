package visitor.value;

public class DoubleValue extends Value<Double> {
    private Double doubleValue;

    public DoubleValue(Double doubleValue){
        this.doubleValue = doubleValue;
    }

    @Override
    public Double getValue() {
        return this.doubleValue;
    }
}
