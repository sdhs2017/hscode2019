package member.yiyang.ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockedTest {
    public static void main(String[] args) throws InterruptedException{
        LockedProducerConsumer lpc = new LockedProducerConsumer(5);
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Runnable producerTask = () -> {
            try {
                while (true) {
                    lpc.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };



        Runnable consumerTask = () -> {
            try {
                while (true) {
                    lpc.consume();
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executor.execute(producerTask);

        Thread.sleep(5000);
        executor.execute(consumerTask);
        Thread.sleep(5000);
        executor.shutdown();
    }
}
