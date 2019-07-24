package member.yiyang.observer.basicDemo;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("concreteSubject state:" + newState);

        //状态发生改变，通知观察者
        notifyEveryOne(newState);
    }
}
