package member.Kristen.pattern.Iterator;

import java.util.ArrayList;
public class NameList {

    public static ArrayList<String> names =new ArrayList<>();

    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator{


        int index=names.size()-1;

        @Override
        public Boolean hasNext() {
            if(index >=0){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names.get(index--);
            }
            return null;
        }
    }


}
