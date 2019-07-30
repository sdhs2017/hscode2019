package member.savilio.design_pattern.builder.demo2;


/**
 * 比第一种方式少了指挥者，主要是因为第二种方式把指挥者交给用户来操作，使得产品的创建更加简单灵活。
 */
public class Client {

    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();

//        Product product = builder.retrieveResult();

        Product product = builder
                .buildPart1("SAMSUNG Ram")
                .retrieveResult();

//        Product product = builder
//                .buildPart1("SAMSUNG Ram")
//                .buildPart2("Intel cpu")
//                .retrieveResult();


        System.out.println(product.toString());

    }
}
