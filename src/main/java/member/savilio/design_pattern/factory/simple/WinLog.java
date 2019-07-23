package member.savilio.design_pattern.factory.simple;

/**
 * windows log
 */
public class WinLog extends BaseLog implements LogIf {

    public WinLog(){
        setLog_type("winLog");
    }


    public String getLogInfo() {
        String info = "winlog";
        return info;
    }
}
