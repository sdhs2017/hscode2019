package member.savilio.design_pattern.builder.demo1;

/**
 * 抽象建造者角色
 * 提供零件建造方法及返回结果方法
 */
public interface Builder {

    void buildPart1();
    void buildPart2();

    Product retrieveResult();

}
