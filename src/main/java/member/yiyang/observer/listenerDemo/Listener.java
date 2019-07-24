package member.yiyang.observer.listenerDemo;

import java.util.Observable;
import java.util.Observer;

/**
 *定义抽象类，实现观察者接口，用来观察一些事件
 */
public abstract class Listener implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        doAction(o,arg);
    }

    /**
     * 定义一个抽象方法
     * 需要实现一个事件的具体执行内容
     * @param o
     * @param arg
     */
    public abstract void doAction(Observable o, Object arg);
}
