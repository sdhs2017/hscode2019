package member.savilio.design_pattern.proxy.static_proxy.demo1;

/**
 * 代理模式，测试入口
 */
public class ProxyDemo {

    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }

}
