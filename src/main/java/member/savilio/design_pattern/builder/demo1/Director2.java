package member.savilio.design_pattern.builder.demo1;

public class Director2 {

    /**
     * 另一种实现
     */
    public Product getProduct(Builder builder){
        builder.buildPart1();
        builder.buildPart2();
        return builder.retrieveResult();
    }

}
