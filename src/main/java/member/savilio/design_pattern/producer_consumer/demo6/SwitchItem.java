package member.savilio.design_pattern.producer_consumer.demo6;

import java.util.Observable;

public class SwitchItem extends Observable {
    //开关
    boolean on_off;
    public synchronized boolean isOn_off() {
        return on_off;
    }

//    public synchronized void setOn_off(boolean on_off) {
//        super.setChanged();
//        super.notifyObservers(on_off);
//        this.on_off = on_off;
//        while(!on_off){
//            try {
//                System.out.println("切换开关");
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.notify();
//    }
//

    public synchronized void setOn_off(boolean on_off) {
        super.setChanged();
        super.notifyObservers(on_off);
        this.on_off = on_off;
    }
    public SwitchItem(boolean on_off){
        this.on_off=on_off;
    }

}
