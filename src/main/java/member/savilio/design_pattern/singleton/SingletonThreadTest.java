package member.savilio.design_pattern.singleton;

import member.savilio.design_pattern.singleton.early.ConfigurationEarly;
import member.savilio.design_pattern.singleton.lazily.ConfigurationLazy;

import java.util.concurrent.CountDownLatch;

public class SingletonThreadTest {

//    //倒计时,param：执行次数
//    static CountDownLatch latch = new CountDownLatch(100);
//
//    public static void main(String[] args) {
//        for(int i=0;i<100;i++){
//            Thread th = new Thread();
//            th.start();
//            latch.countDown();
//        }
//    }



        public static void main(String[] args) throws InterruptedException {

            for(int i=0;i<10;i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
//                        ConfigurationEarly.getInstance();
                        ConfigurationLazy.getInstance();
//                        ConfigurationLazy.getInstance2();
//                        ConfigurationLazy.getInstance3();

                    }
                }).start();
//			Thread.sleep(200);
            }
        }


}
