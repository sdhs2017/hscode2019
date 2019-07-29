package member.ruinye.design_patterns.structural_patterns.adapter.object_adapter;

public class Winlog implements Log{

    // 适配类作为属性
    Baselog baselog = new Baselog();

    /**
     * 事件级别
     */
    private Integer event_level;
    /**
     * 事件类型
     */
    private String event_type;
    /**
     * 事件描述
     */
    private String event_des;

    @Override
    public String toMapping() {
        System.out.println("实现接口类方法");
        String template = "{\n"
                +"\t\t\"properties\":{\n"
                + "\t\t{#}\n"
                + "\t\t\t\t}"
                +"}";
        String fieldString =  baselog.getClassMapping(new Winlog());
        template = template.replace("{#}",fieldString);
        return template;
    }
}
