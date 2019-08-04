package member.savilio.basic.generics.generics_method;

class DataHolder<T>{
    T item;

    public void setData(T t) {
        this.item=t;
    }

    public T getData() {
        return this.item;
    }

    /**
     * 泛型方法
     * @param e
     */
    public <E> void PrinterInfo(E e) {
        System.out.println(e);
    }


    /**
     * 泛型方法
     * @param key
     * @param value
     * @param <K>
     * @param <V>
     */
    public <K,V> void PrinterInfo2(K key,V value) {
        System.out.println("key:"+key+"   value:"+value);
    }
}