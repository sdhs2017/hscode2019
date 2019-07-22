package member.yiyang.singleton;

public class Test {
    public static void main(String[] args){

        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1 == s2); // true
        s1.setData("Test:");
        s1.getSomeString();
    }
}
