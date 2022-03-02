package visitor.value;

public class NullValue extends Value<Void>{

    @Override
    public Void getValue() {
        return null;
    }
}
