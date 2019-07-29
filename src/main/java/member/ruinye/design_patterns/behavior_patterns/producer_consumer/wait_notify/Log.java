package member.ruinye.design_patterns.behavior_patterns.producer_consumer.wait_notify;

import java.util.LinkedList;

/**
 * 中间处理
 */
public class Log {

    // 缓存区大小
    private final int  size = 5;
    // 数据缓存
    private LinkedList<String> list  = new LinkedList();

    public void produce(String log) {
        synchronized (list) {
            while (list.size() >= size) {
                System.out.println("缓存已满  " +Thread.currentThread().getName()+ "生产处于等待状态···");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(log);
            System.out.println(Thread.currentThread().getName() + "生产一条日志，当前缓存" + list.size());
            list.notifyAll();
        }
    }

    public void consume() {
        synchronized (list) {
            while (list.size() == 0) {
                System.out.println("仓库为空 "+Thread.currentThread().getName()+ " 消费处于等待状态···");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println(Thread.currentThread().getName()  + "消费一条日志，当前缓存" + list.size());
            list.notifyAll();
        }
    }

}
