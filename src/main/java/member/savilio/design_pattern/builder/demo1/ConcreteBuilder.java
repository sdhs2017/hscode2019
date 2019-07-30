package member.savilio.design_pattern.builder.demo1;

/**
 * 具体建造者角色
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    /**
     * 建造零件1
     */
    @Override
    public void buildPart1() {
        product.setPart1("id:1001,RAM");
    }

    /**
     * 建造零件2
     */
    @Override
    public void buildPart2() {
        product.setPart2("id:2001,CPU");
    }

    /**
     * 返回建造后成功的产品
     * @return
     */
    @Override
    public Product retrieveResult() {
        return product;
    }

}