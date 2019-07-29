package member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify;

public class Consumer implements Runnable{

    private Log log;

    public Consumer(Log log){
        this.log = log;
    }

    @Override
    public void run() {
        while (true){
            log.consume();
        }
    }
}
