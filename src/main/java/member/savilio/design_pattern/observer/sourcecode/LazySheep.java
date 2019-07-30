package member.savilio.design_pattern.observer.sourcecode;

public class LazySheep implements Observer {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(this.name+"羊收到通知："+status);
    }
}
