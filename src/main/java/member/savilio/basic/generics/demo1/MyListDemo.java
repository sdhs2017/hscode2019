package member.savilio.basic.generics.demo1;

public class MyListDemo {

    public static void main(String[] args) {
        MyList myList=new MyList();
        myList.add("A");
        myList.add(1);
        System.out.println(myList.get(0));
        System.out.println((String)myList.get(1));
    }

}
