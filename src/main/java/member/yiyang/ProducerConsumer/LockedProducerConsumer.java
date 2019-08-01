package member.yiyang.ProducerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过锁机制对生产和消费进行控制
 * 生产超过阈值开始消费，保证生产量维持在一定程度
 *
 */
public class LockedProducerConsumer {
    private int capacity;
    private int index = 0;
    Lock lock = new ReentrantLock();
    Condition full = lock.newCondition();
    Condition empty = lock.newCondition();
    public LockedProducerConsumer(int i){
        this.capacity = i;
    }
    public void produce() {
        lock.lock();
        try {
            while (index > capacity) {
                try {
                    full.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("produce:"+index);
            index++;
            empty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void consume() {
        lock.lock();
        try {
            while (index <= capacity) {
                try {
                    empty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            index--;
            System.out.println("consumer:"+index);
            full.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
