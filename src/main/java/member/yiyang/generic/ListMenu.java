package member.yiyang.generic;

import java.util.ArrayList;
import java.util.List;

public class ListMenu<T> {
    static final int MAX_ITEMS=3;
    int items=0;
    List<T> listItems;
    public ListMenu(){
        listItems=new ArrayList<>();
    }

    void Add(T t)
    {
        listItems.add(t);
    }

    MyIteratorImpl<T> getList(){
        return new MyIteratorImpl(listItems);
    }

}
