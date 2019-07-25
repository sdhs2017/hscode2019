package member.savilio.design_pattern.producer_consumer.demo1;

import java.util.concurrent.TimeUnit;

/**
 * 厨师
 */
public class Chef implements Runnable {

    private int count=0;
    private  Restaurant restaurant;

    public Chef(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    @Override
    public void run() {
        try{
            //shutdownNow后会退出循环
            while(!Thread.interrupted()){
                synchronized (this){
                    //如果有meal，则释放锁，等待
                    while (restaurant.meal!=null){
                        wait();
                    }
                }
                if(++ count == 10){
                    System.out.println("Out of 10");
                    restaurant.exec.shutdownNow();
//                    count++;
                }
                synchronized (restaurant.waitPerson){
                    restaurant.meal = new Meal(count);
                    restaurant.waitPerson.notifyAll();
                }
                TimeUnit.SECONDS.sleep(1);
            }
        }catch(InterruptedException e){
            System.out.println("Chef interrupted");
        }

    }
}
