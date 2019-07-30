package member.savilio.design_pattern.builder.demo3;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        Product.ConcreteBuilder builder = new Product.ConcreteBuilder("Samsung RAM","Intel CPU");
        Product product = builder.getProduct();
        System.out.println(product.toString());
    }

}
