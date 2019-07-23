package member.savilio.design_pattern.factory.simple;

/**
 * http log
 */
public class HttpLog extends BaseLog implements LogIf {

    //port,目的ip
    String port;
    String ip;


    public HttpLog(){
        setLog_type("httpLog");
    }


    public String getLogInfo(){
        String info = "httplog";

        return info;
    }


}
