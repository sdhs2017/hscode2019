package member.yiyang.observer.basicDemo.observerImpl;

import member.yiyang.observer.basicDemo.Observer;

public class ObserverA implements Observer {
    //观察者状态
    private String observerState;

    public void update(String newState) {
        //更新观察者状态，让它与目标状态一致
        observerState = newState;
        System.out.println("观察者A,状态："+newState);
    }
}
