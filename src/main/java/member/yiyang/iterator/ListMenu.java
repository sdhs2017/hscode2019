package member.yiyang.iterator;

import java.util.ArrayList;
import java.util.List;

public class ListMenu {
    static final int MAX_ITEMS=3;
    int items=0;
    List<String> listItems;
    public ListMenu(){
        listItems=new ArrayList<>();
        listItems.add("1111");
        listItems.add("2222");
        listItems.add("3333");
    }

    public IMyIterator createIterator(){
        return new ListIteratorImpl(listItems);
    }
}
