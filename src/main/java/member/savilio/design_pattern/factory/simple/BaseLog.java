package member.savilio.design_pattern.factory.simple;

/**
 * 基础日志entity
 */
public class BaseLog implements LogIf{

    private String log_id;              //日志id
    private String log_type;            //日志类型
    //TODO 类型设置为String或Date?
    private String log_date;            //日志时间
    private String log_level;           //日志级别
    private String log_content;         //日志内容
    private String ip;                  //ip地址

//    private String info;

    public BaseLog(){
        setLog_type("Syslog");
    }


    public void printInfo(){
        System.out.println(log_id+"---"+log_type+"---"+log_date+"---"+log_level+"---"+log_content+"---"+ip);
    }

    public String toString(){
        return log_id+"---"+log_type+"---"+log_date+"---"+log_level+"---"+log_content+"---"+ip;
    }

    public String getLogInfo() {
        return getLog_type();
    }

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public String getLog_type() {
        return log_type;
    }

    public void setLog_type(String log_type) {
        this.log_type = log_type;
    }

    public String getLog_date() {
        return log_date;
    }

    public void setLog_date(String log_date) {
        this.log_date = log_date;
    }

    public String getLog_level() {
        return log_level;
    }

    public void setLog_level(String log_level) {
        this.log_level = log_level;
    }

    public String getLog_content() {
        return log_content;
    }

    public void setLog_content(String log_content) {
        this.log_content = log_content;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


}
