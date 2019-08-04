package member.savilio.basic.generics.generics_class;

public class DataHolder2<K,V> {

    K key;
    V value;

    public void setData(K key,V value){
        this.key=key;
        this.value=value;
    }

    public V getValue(K key){
        return this.value;
    }

    public DataHolder2<K,V> getData(){
        return this;
    }

}
