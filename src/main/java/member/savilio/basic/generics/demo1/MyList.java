package member.savilio.basic.generics.demo1;

class MyList{
    private Object[] elements=new Object[10];
    private int size;

    public void add(Object item) {
        elements[size++]=item;
    }

    public Object get(int index) {
        return elements[index];
    }
}
