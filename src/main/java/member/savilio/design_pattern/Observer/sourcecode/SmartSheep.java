package member.savilio.design_pattern.Observer.sourcecode;

public class SmartSheep implements  Observer{

    String name;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(this.name+"羊收到通知："+status);
    }
}
