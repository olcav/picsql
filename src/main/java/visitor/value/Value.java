package visitor.value;

/**
 * A generic value created by the visitor.
 * @param <T> the type of the value.
 */
public abstract class Value<T> {
  public abstract T getValue();
}
