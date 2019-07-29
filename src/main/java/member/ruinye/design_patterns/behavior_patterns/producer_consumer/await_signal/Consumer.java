package member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal;

public class Consumer implements Runnable{

    private Log log;

    public Consumer(Log log){
        this.log = log;
    }

    @Override
    public void run() {
        while (true){
            try {
                log.consume();
            } catch (InterruptedException e) {
                System.out.println("日志消费异常");
                e.printStackTrace();
            }
        }
    }
}