package member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal;

import member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal.producers.SyslogProducer;
import member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal.producers.WinlogProducer;

public class TestAwait_signal {

    public static void main(String [] args){

        Log log = new Log();

        Thread syslog1 = new Thread(new SyslogProducer(log));
        Thread syslog2 = new Thread(new SyslogProducer(log));

        Thread winlog1 = new Thread(new WinlogProducer(log));
        Thread winlog2 = new Thread(new WinlogProducer(log));

        Thread consumer1 = new Thread(new Consumer(log));
        Thread consumer2 = new Thread(new Consumer(log));
    }
}
