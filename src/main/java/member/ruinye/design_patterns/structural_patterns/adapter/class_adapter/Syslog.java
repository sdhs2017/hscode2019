package member.ruinye.design_patterns.structural_patterns.adapter.class_adapter;


/**
 * 通过适配类实现接口中的内容
 */
public class Syslog extends Baselog implements Log{


    /**
     * 日志模块
     * (facility)
     */
    String operation_facility;
    /**
     * 日志级别
     * (Severity level)
     */
    String operation_level;
    /**
     * 进程名
     */
    String process;
    /**
     * PID
     */
    String PID;
    /**
     * 操作描述
     */
    String operation_des;

    public String getOperation_facility() {
        return operation_facility;
    }

    public void setOperation_facility(String operation_facility) {
        this.operation_facility = operation_facility;
    }

    public String getOperation_level() {
        return operation_level;
    }

    public void setOperation_level(String operation_level) {
        this.operation_level = operation_level;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getOperation_des() {
        return operation_des;
    }

    public void setOperation_des(String operation_des) {
        this.operation_des = operation_des;
    }


    /**
     * 实现接口方法
     * @return
     */
    @Override
    public String toMapping() {

        System.out.println("实现接口类方法");
        String template = "{\n"
                +"\t\t\"properties\":{\n"
                + "\t\t{#}\n"
                + "\t\t\t\t}"
                +"}";
        String fieldString =  super.getClassMapping(new Syslog());
        template = template.replace("{#}",fieldString);
        return template;
    }
}
