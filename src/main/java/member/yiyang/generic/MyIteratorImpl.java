package member.yiyang.generic;

import java.util.List;

public class MyIteratorImpl<T> implements IMyIterator<T> {
    List<T> list;
    int position=0;
    public MyIteratorImpl(List<T> list){
        this.list=list;
    }

    @Override
    public boolean hasNext() {
        if(position>= list.size()|| list.get(position)==null){
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        T str = list.get(position);
        position++;
        return str;
    }
}
