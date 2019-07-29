package member.Kristen.pattern.proxy.staticProxy3;

import java.util.ArrayList;


public class Subject {

    private ArrayList<Observer> observers=new ArrayList<>();


    public void attach(Observer observer){
        observers.add(observer);
    }

    public void newHW(Boolean b){
        Boolean bb=b;
       if(b)
           notifyall();
    }


    /**
     * 可以在这里改成只通知特定的班级
     * 这样突出了代理模式的好处，通过代理分组，然后分组通知
     */
    public void notifyall(){
        System.out.println("有新的作业！");
        for (Observer observer : observers) {

            observer.update();
        }

    }


}
