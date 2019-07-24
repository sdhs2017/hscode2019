package member.yiyang.observer.listenerDemo;

import java.util.Observable;
import java.util.Observer;

/**
 * 事件类，被观察者基本事件定义
 */
public class BaseEvent extends Observable {
    /**
     * 事件的生效时通知监听器动作
     * @param message
     */
    public void notify(Object message) {
        this.setChanged();
        if (message != null) {
            this.notifyObservers(message);
        } else {
            this.notifyObservers();
        }
    }
    /**
     * 添加事件
     * @param 自定义的事件
     */
    public void setListener(Observer observer){
        this.addObserver(observer);
    }
    /**
     * 移除事件
     * @param 自定义的事件
     */
    public void removeListener(Observer observer){
        this.deleteObserver(observer);
    }

}
