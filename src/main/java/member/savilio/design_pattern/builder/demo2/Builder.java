package member.savilio.design_pattern.builder.demo2;


/**
 * 抽象建造者角色
 * 提供零件建造方法及返回结果方法
 */
public interface Builder {

    Builder buildPart1(String ram);
    Builder buildPart2(String cpu);

    Product retrieveResult();

}
