package member.Kristen.pattern.Builder.Demo1;

public class Taobao {
    public static void main(String[] args) {
        CommodityBuilder commodityBuilder=new CommodityBuilder();

        //垃圾！：只要把T恤跟裤子分组在一起，他们的颜色跟shipping'都是以一样的
        Commodity cloth=commodityBuilder.cloth();
        System.out.println("clothes");
        //1： 免邮
        //1： 蓝色
        cloth.display(1,1);




        System.out.println(" ");
        Commodity food=commodityBuilder.food();
        System.out.println("food");
        //1： 免邮

        food.display(3,2);


        System.out.println(" ");
        Commodity needitimmidaly=commodityBuilder.needItImmediatly();
        System.out.println("特快邮寄组");


        needitimmidaly.display(3,3);

    }
}
