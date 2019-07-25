package member.savilio.design_pattern.producer_consumer.demo2;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        Resource resource = new Resource();
        //生产线程
        Producer p1 = new Producer(resource);
        //消费线程
        Consumer c1 = new Consumer(resource);

        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(c1);

        thread1.start();
        thread2.start();

//        try {
//
//            Thread.sleep(3000);
//            thread1.interrupt();
//            thread2.interrupt();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
