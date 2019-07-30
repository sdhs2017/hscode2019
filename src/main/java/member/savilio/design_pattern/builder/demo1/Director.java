package member.savilio.design_pattern.builder.demo1;

/**
 * 导演角色类
 */
public class Director {
    /**
     * 创建建造者对象
     */
    private Builder builder;

    /**
     * 构造函数，给定建造者对象
     * @param builder 建造者对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，在该方法内，调用产品零件建造方法。
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
