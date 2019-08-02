package member.Kristen.pattern.Template.Demo2Thread;

import java.util.ArrayList;

public class Resource {

    //当前资源的数量
    int num = 0;
    //当前资源的上限, 10盘就满了
    int size = 10;

    ArrayList<LeekPorc> lp=new ArrayList<>();
    ArrayList<CarrotLamb> cl=new ArrayList<>();


    /**
     * 一共有10盘饺子
     * @param choice
     */
    public synchronized void put(int choice) {
        int choose=choice;
        //如果资源满了，就进入阻塞状态
        while (num == size) {//这里jdk源码里推荐用while，因为有可能出现虚假唤醒，所以要再次确认
       // if (num >= size) {//这里jdk源码里推荐用while，因为有可能出现虚假唤醒，所以要再次确认
            try {
                System.out.println("生产者进入等待");
                this.wait();//线程进入阻塞状态，并释放锁

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /**
         * 在这里生产饺子
         *
         */
        if(choose==1){
            lp.add(new LeekPorc());
            System.out.println("煮了一盘韭菜猪肉饺子");
        } else if(choose==2){
            cl.add(new CarrotLamb());
            System.out.println("煮了一盘胡萝卜肉饺子");
        }

        num++;
        System.out.println("生产者线程为:" + Thread.currentThread().getName() + "--资源数量:" + num);
        this.notify();//唤醒其他正在等待的线程

    }

    //消费资源

    /**
     * 大家都倾向韭菜饺子， 韭菜的没有了就买胡萝卜的
     */
    public synchronized void remove() {


        //如果num为0，没有资源了，需要等待
        //或者开关状态为关闭：false
//        while (num == 0 || !isOn_off()) {//这里jdk源码里推荐用while，因为有可能出现虚假唤醒，所以要再次确认
        // if (num == 0 || !isOn_off()) {//这里jdk源码里推荐用while，因为有可能出现虚假唤醒，所以要再次确认
        if (num == 0) {
            try {
                System.out.println("消费者进入等待");
                this.wait();//线程等待，并释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /**
         * 在这里吃饺子
         *
         */
        if(!lp.isEmpty() ){
            lp.remove(new LeekPorc());
            System.out.println("吃了一盘韭菜猪肉饺子");
        }
        else if (!cl.isEmpty() ){
            cl.remove(new CarrotLamb());
            System.out.println("吃了一盘胡萝卜素饺子");
        }


        //如果线程可以执行到这里，说明资源里有资源可以消费
        num--;
        System.out.println("消费者线程为:" + Thread.currentThread().getName() + "--资源数量:" + num);
        this.notify();//唤醒其他正在等待的线程
    }

}
