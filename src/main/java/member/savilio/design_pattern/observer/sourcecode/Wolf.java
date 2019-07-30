package member.savilio.design_pattern.observer.sourcecode;

public class Wolf extends  Subject{

    void invade(){
        System.out.println("狼:I am coming！");
        notifyObserver();
    }
}
