package member.ruinye.design_patterns.creative_patterns.builder;

public class String_builder {

    public static void main(String [] args){

        StringBuilder sss = new StringBuilder();
        sss.append("hello");
        sss.append("world");
        sss.append("!");

        String s = sss.toString();

        System.out.println(s);

    }
}
