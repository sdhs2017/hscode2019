package member.yiyang.iterator;


public class Test {
    public static void main(String[] args) {

        ListMenu lm = new ListMenu();
        IMyIterator list = lm.createIterator();
        while (list.hasNext()){
            String next = (String) list.next();
            System.out.println(next);
        }
    }
}
