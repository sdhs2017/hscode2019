package member.savilio.design_pattern.factory.simple;


/**
 * simple factory example
 * 简单工厂模式
 *
 */
public class SimpleFactoryTest {


    public static void main(String[] args){

//        String number = String.valueOf(12);


//        BaseLog baseLog = new BaseLog();
//        baseLog.setLog_id("001");
//        baseLog.setLog_type("baseLog");
//        baseLog.printInfo();
//        System.out.println(baseLog.toString());



        SimpleLogFactory slf = new SimpleLogFactory();

//        BaseLog log = slf.getLog(logtype);

        String logtype = "WinLog";
        LogIf log = slf.getLog(logtype);
        System.out.println(log.getLogInfo());


        logtype = "HttpLog";
        LogIf log2 = slf.getLog(logtype);
        System.out.println(log2.getLogInfo());


        logtype = "Syslog";
        LogIf log3 = slf.getLog(logtype);
        System.out.println(log3.getLogInfo());
    }

}
