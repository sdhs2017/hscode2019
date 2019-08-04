package member.savilio.basic.generics.generics_interface;

public interface Generator<T> {
    public T next();

    public T next2(T t);
}