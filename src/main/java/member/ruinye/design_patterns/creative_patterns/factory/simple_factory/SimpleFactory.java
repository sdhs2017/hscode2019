package member.ruinye.design_patterns.creative_patterns.factory.simple_factory;

public class SimpleFactory {


    public static Base_Log log(String logtype){
        switch (logtype){
            case "syslog":
                return new Syslog();
            case  "winlog":
                return new Winlog();
            default:
                return new Unknown();

        }
    }

}
