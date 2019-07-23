package member.savilio.design_pattern.Observer.sourcecode;

public class Wolf extends  Subject{

    void invade(){
        System.out.println("狼:I am coming！");
        notifyObserver();
    }
}
