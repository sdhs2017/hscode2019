package member.savilio.design_pattern.builder.demo3;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        Product.ConcreteBuilder builder = new Product.ConcreteBuilder("id:1001,RAM","id:2001,CPU");
        Product product = builder.setPart1("Samsung RAM").setPart2("Intel CPU").getProduct();
        System.out.println(product.toString());
    }

}
