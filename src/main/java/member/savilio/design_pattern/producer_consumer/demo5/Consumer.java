package member.savilio.design_pattern.producer_consumer.demo5;


import java.util.Observable;
import java.util.Observer;

public class Consumer implements Runnable, Observer {

    private Resource resource;
    private boolean on_off;

    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            while (isOn_off()) {
                resource.remove();
            }
        }
    }

//    @Override
//    public void update(String status) {
//
//    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("开关状态切换："+(Boolean)arg);
        setOn_off((Boolean)arg);
    }
}