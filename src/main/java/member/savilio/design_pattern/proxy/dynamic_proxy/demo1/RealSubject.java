package member.savilio.design_pattern.proxy.dynamic_proxy.demo1;

/**
 * 原对象，委托对象
 *
 */
public class RealSubject implements Subject {


    @Override
    public void request() {
        System.out.println("request");
    }
}
