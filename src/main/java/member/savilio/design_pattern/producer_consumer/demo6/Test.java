package member.savilio.design_pattern.producer_consumer.demo6;

public class Test {

    public static void main(String[] args) {


        //被观察者：开关
        SwitchItem switchItem = new SwitchItem(false);

        Resource resource = new Resource();



        //生产线程
        Producer p1 = new Producer(resource);
        //消费线程
        Consumer c1 = new Consumer(resource);

        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(c1);

        //
//        switchItem.addObserver(c1);
        switchItem.addObserver(resource);
//        resource.addObserver(c1);

        thread1.start();
        thread2.start();

        try {

            Thread.sleep(3000);
            switchItem.setOn_off(true);

            Thread.sleep(3000);
            switchItem.setOn_off(false);

            Thread.sleep(3000);
            switchItem.setOn_off(true);

            Thread.sleep(3000);
            switchItem.setOn_off(false);

//            resource.setOn_off(true);

//            thread1.interrupt();
//            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
