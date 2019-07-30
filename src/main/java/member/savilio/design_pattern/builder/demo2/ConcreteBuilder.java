package member.savilio.design_pattern.builder.demo2;


/**
 * 具体建造者角色
 */
public class ConcreteBuilder implements Builder {

//    private Product product = new Product();
    private Product product;
    public ConcreteBuilder(){
        product = new Product();
    }

    /**
     * 建造零件1
     */
    @Override
    public Builder buildPart1(String ram) {
        product.setPart1(ram);
        return this;
    }

    /**
     * 建造零件2
     */
    @Override
    public Builder buildPart2(String cpu) {
        product.setPart2(cpu);
        return this;
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