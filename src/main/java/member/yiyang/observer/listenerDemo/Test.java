package member.yiyang.observer.listenerDemo;

import java.util.Observable;

public class Test {
    public static void main(String[] args){

        OnClickEvent event = new OnClickEvent();
        event.setListener(new Listener(){
            public void doAction(Observable o, Object arg) {
                //doSomething
                System.out.println("111");
            }
        });
        //传递参数模拟点击事件，onclick时，触发事件
        event.onclick("onclick");
        event.onclick("otherclick");


    }
}
