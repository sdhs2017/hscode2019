package member.yiyang.adapter;

public class Adapter implements ITarget {

    //持有源接口对象
    private Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 重写目标接口的方法，以适应客户端的需求
     */
    @Override
    public void request() {
        //调用源接口的方法
        System.out.println("适配器包装源接口对象，调用源接口的方法");
        adaptee.specifiRequest();
    }
}
