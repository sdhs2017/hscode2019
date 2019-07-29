package member.ruinye.design_patterns.behavior_patterns.producer_consumer.await_signal;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 中间处理
 */
public class Log {

    // 缓存区大小
    private final int  size = 5;
    // 数据缓存
    private LinkedList<String> list  = new LinkedList();

    // 定义锁
    private final Lock lock = new ReentrantLock();
    // 将条件变量与一个锁进行绑定
    // 条件：缓存区满
    private final Condition logfull = lock.newCondition();
    // 条件：缓存区空
    private final Condition logempty = lock.newCondition();


    public void produce(String log) throws InterruptedException {

        // 获得锁
        lock.lock();
        while (list.size() >= size) {
            System.out.println("缓存已满  " +Thread.currentThread().getName()+ "生产处于等待状态···");

            logfull.await();
        }
        list.add(log);
        System.out.println(Thread.currentThread().getName() + "生产一条日志，当前缓存" + list.size());

        logfull.signalAll();
        logempty.signalAll();
        lock.unlock();
    }

    public void consume() throws InterruptedException {
        lock.lock();
        while (list.size() == 0) {
            System.out.println("仓库为空 "+Thread.currentThread().getName()+ " 消费处于等待状态···");

            logempty.await();
        }
        list.remove();
        System.out.println(Thread.currentThread().getName()  + "消费一条日志，当前缓存" + list.size());

        logfull.signalAll();
        logempty.signalAll();
        lock.unlock();
    }

    }