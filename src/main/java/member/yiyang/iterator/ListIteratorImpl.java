package member.yiyang.iterator;


import java.util.List;

/**
 *  数组遍历方式迭代器
 */
public class ListIteratorImpl implements IMyIterator {

    List<String> list;
    int position=0;
    public ListIteratorImpl(List<String> list){
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
    public Object next() {
        String str = list.get(position);
        position++;
        return str;
    }
}
