package member.savilio.design_pattern.observer.demo1;

import java.util.*;

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
