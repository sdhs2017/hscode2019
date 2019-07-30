package member.savilio.design_pattern.builder.demo1;


public class Client {

    public static void main(String[] args) {
        //创建具体建造者对象
        Builder builder = new ConcreteBuilder();
        //创造导演者角色，给定建造者对象
        Director director = new Director(builder);
        //调用导演者角色，创建产品零件
        director.construct();
        //接收建造者角色产品建造结果
        Product product = builder.retrieveResult();
        System.out.println(product.toString());



        //另一种实现
        Director2 director2 = new Director2();
        System.out.println(director2.getProduct(builder));

//        Builder builder2 = new ConcreteBuilder();
//        System.out.println(director2.getProduct(builder2));



    }
}
