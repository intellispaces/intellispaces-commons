package intellispaces.common.base.function;

@FunctionalInterface
public interface ThrowableConsumer<T, E extends Throwable> {

  void accept(T t) throws E;
}
