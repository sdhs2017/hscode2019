package member.Kristen.pattern.proxy.staticProxy;

public class Office {

    public static void main(String[] args) {
        TomA tomA=new TomA();
        BanzhangA banzhangA=new BanzhangA(tomA);
        System.out.println("老师在办公室里把作业给各班班长");
        banzhangA.homework();

    }


}
