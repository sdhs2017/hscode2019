package member.savilio.basic.keyword.this_test;

public class Person2 {

    String name;
    Integer age;

    Person2(String name){
        this.name=name;
    }

    public Person2(String name,Integer age){
        this(name);
        this.age=age;
        //wrong
//        this(name);
    }

    public static void main(String[] args) {
        //wrong
//        this("");
    }
}
