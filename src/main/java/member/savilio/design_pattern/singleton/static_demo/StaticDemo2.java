package member.savilio.design_pattern.singleton.static_demo;

public class StaticDemo2 {



    private static String info = "hello";

    static {
        info = "hello world";
    }



    public static void main(String[] args) {
        System.out.println(info);
    }

}
