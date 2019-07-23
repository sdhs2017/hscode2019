package member.savilio.design_pattern.factory.simple.test;

public class Test {

    public static  void  main(String[] args){
        BaseLog log = new Syslog();
        log.printinfo();

        BaseLog log2 = new WinLog();
        log2.printinfo();
    }
}
