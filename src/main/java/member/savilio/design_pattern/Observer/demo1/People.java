package member.savilio.design_pattern.Observer.demo1;

import sun.rmi.runtime.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式：商人，价格变动
 */
public class People implements Observer {

    private String name;

    public People(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object data) {
        System.out.println("People update() -> update name:"+ this.name + ",price:"+ ((Float)data).floatValue());
    }
}
