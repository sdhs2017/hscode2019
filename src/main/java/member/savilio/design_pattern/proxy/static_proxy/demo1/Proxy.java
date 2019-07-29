package member.savilio.design_pattern.proxy.static_proxy.demo1;

/**
 * 代理对象
 */
public class Proxy implements Subject {

    private Subject subject;
    public Proxy(Subject subject){
        this.subject=subject;
    }

    @Override
    public void request() {
        //预处理
        System.out.println("PreProcess");
        subject.request();
        //后处理，后置处理
        System.out.println("PostProcess");
    }
}
