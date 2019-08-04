package member.savilio.basic.generics.generics_class;

class DataHolder<T>{
    T item;

    public void setData(T t) {
        this.item=t;
    }

    public T getData() {
        return this.item;
    }
}