package member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify;

import member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify.producers.SyslogProducer;
import member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify.producers.WinlogProducer;

public class TestWait_notify {

    public static void main(String [] args){
        Log log = new Log();

        Thread syslog = new Thread(new SyslogProducer(log));
        Thread winlog = new Thread(new WinlogProducer(log));

        Thread consumer = new Thread(new Consumer(log));

        syslog.start();
        winlog.start();

        consumer.start();
    }
}
