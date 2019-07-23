package member.savilio.design_pattern.factory.simple;

/**
 *  simple factory: log factory
 */
public class SimpleLogFactory {

    public LogIf getLog(String logType){

        if("httplog".equalsIgnoreCase(logType)){
            return new HttpLog();
        }else if("winlog".equalsIgnoreCase(logType)){
            return new WinLog();
        }else{
            return new BaseLog();
        }
    }

}
