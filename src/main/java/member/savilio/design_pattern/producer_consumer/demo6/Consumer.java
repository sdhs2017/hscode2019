package member.savilio.design_pattern.producer_consumer.demo6;


import java.util.Observable;
import java.util.Observer;

public class Consumer implements Runnable {

    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.remove();
        }
    }


//    @Override
//    public void update(Observable o, Object arg) {
//        System.out.println("开关状态切换："+(Boolean)arg);
//        setOn_off((Boolean)arg);
//    }
}