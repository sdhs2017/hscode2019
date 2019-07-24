package member.yiyang.observer.basicDemo;

import member.yiyang.observer.basicDemo.observerImpl.ObserverA;
import member.yiyang.observer.basicDemo.observerImpl.ObserverB;

public class Test {
    public static void main(String[] args){

        ConcreteSubject c1 = new ConcreteSubject();
        ObserverA oa = new ObserverA();
        ObserverB ob = new ObserverB();
        c1.attach(oa);
        c1.attach(ob);
        c1.change("1");
        c1.change("2");
        c1.detach(oa);
        c1.change("3");
    }
}
