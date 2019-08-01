package member.yiyang.adapter;

/**
 * 缺点
 * 过多的使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是A接口，其实内部被适配成了B接口的实现
 */
public class Test {
    public static void main(String[] args){

        //创建源对象（被适配的对象）
        Adaptee adaptee = new Adaptee();
        //利用源对象对象一个适配器对象，提供客户端调用的方法
        Adapter adapter = new Adapter(adaptee);
        System.out.println("客户端调用适配器中的方法");
        adapter.request();

    }
}
