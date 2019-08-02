package member.savilio.design_pattern.iterator_pattern.demo1;

public class StringArrayIterator implements Iterator{
    String[] args;
    int index = 0;
    public StringArrayIterator(String[] argTemp){
        this.args  = argTemp;
    }

    @Override
    public boolean hasNext(){
        if(index < args.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next(){
        if(index < args.length){
            return args[index++];
        }
        return null;
    }
}

class NameRepository2 implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}