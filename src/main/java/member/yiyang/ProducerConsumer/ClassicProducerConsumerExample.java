package member.yiyang.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 缓冲区仅仅负责以线程安全的形式来存储和删除元素。
 * 问题：生产和消费不同步，没生产就开始消费
 */
public class ClassicProducerConsumerExample {

    public static void main(String[] args) throws InterruptedException {

        Buffer buffer = new Buffer(2);
        Thread producerThread = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    buffer.produce(value);

                    System.out.println("Produced " + value);

                    value ++;

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int value = buffer.consume();

                    System.out.println("Consume " + value);

                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        //引入线程池概念
        //为了解决队列阻塞问题，JAVA 提供一个BlockingQueue，代替缓冲区对象
        /**
         * ArrayBlockingQueue&&LinkedBlockingDeque
         *ArrayBlockingQueue是基于数组的、有界的、遵循FIFO原则的阻塞队列，队列初始化时必须指定队列的长度。
         * LinkedBlockingQueue是基于链表的、有界的、遵循FIFO原则的阻塞队列，队列默认的最大长度为Integer.MAX_VALUE
         * 1.LinkedBlockingQueue是基于链表实现的初始化是可以不用指定队列大小（默认是Integer.MAX_VALUE）；ArrayBlockingQueue是基于数组实现的初始化时必须指定队列大小
         *

         * 2.LinkedBlockingQueue在puts操作都会生成新的Node对象，takes操作Node对象在某一时间会被GC，可能会影响GC性能；ArrayBlockingQueue是固定的数组长度循环使用，
         *   不会出现对象的产生与回收
         *
         * **** Tips:  GC : Garbage Collections 字面意思是垃圾回收器
         *
         * 3.LinkedBlockingQueue是基于链表的形式，在执行remove操作时，不用移动其他数据；ArrayBlockingQueue是基于链表，在remove时需要移动数据，影响性能
         *
         * 4.LinkedBlockingQueue使用两个锁将puts操作与takes操作分开；ArrayBlockingQueue使用一个锁来控制，在高并发高吞吐的情况下，LinkedBlockingQueue的性能较好
         */
        /**
         * SynchronousQueue
         * 是同步队列，意思是其生产者与消费者之间直接传递数据，取消掉了Channel这一共享缓冲区，这是一种同步的直接交付方式，
         * 可以认为其是一个内部队列固定长度为1的阻塞队列实现，也因此在put操作之后该队列就已经满，因此必须有对应的take操作，否则该队列无法继续生产元素,
         * 则对应的生产线程会被休眠进入WAITING状态。
         */
        //
        //后面的<>不填  默认与前面的<Integer>同样类型
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(2);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable producerTask = () -> {
            try {
                int value = 0;
                while (true) {
                    blockingQueue.put(value);

                    System.out.println("Produced " + value);

                    value++;

                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable consumerTask = () -> {
            try {
                while (true) {
                    int value = blockingQueue.take();

                    System.out.println("Consume " + value);

                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executor.execute(producerTask);
        executor.execute(consumerTask);

        executor.shutdown();
    }

    static class Buffer {

        private Queue<Integer> list;
        private int size;

        public Buffer(int size) {
            this.list = new LinkedList<>();
            this.size = size;
        }

        public void produce(int value) throws InterruptedException {
            synchronized (this) {
                while (list.size() >= size) {
                    // wait for the consumer
                    wait();
                }

                list.add(value);
                // notify the consumer
                notify();
            }

        }

        public int consume() throws InterruptedException {
            synchronized (this) {
                while (list.size() == 0) {
                    // wait for the producer
                    wait();
                }

                int value = list.poll();

                // notify the producer
                notify();
                return value;
            }

        }
    }
}
