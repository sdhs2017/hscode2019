package member.savilio.design_pattern.observer.sourcecode;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {


    //观察者对象集合
    private List<Observer> list = new ArrayList<>();

    /**
     * 登记观察者
     */
    public synchronized void attach(Observer o){
        if(o==null){
            throw new NullPointerException();
        }
        if(!list.contains(o)){
            list.add(o);
            System.out.println("增加了观察者：" + o.getName());
        }

    }

    /**
     * 删除观察者
     */
    public synchronized void detach(Observer o){
        list.remove(o);
        System.out.println("删除了观察者：" + o.getName());
    }

    /**
     * 通知所有观察者
     */
    void notifyObserver(){

        //判断状态是否发生改变
        /*
        synchronized(this){
            //TODO
        }
        */
        for(Observer o:list){
            o.update("狼来了");
        }
    }

}
