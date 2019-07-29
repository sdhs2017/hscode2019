package member.savilio.design_pattern.proxy.dynamic_proxy.demo1;

import java.lang.reflect.Proxy;

/**
 * 代理模式，测试入口
 */
public class ProxyDemo {

    public static void main(String[] args) {

        //1.创建委托对象
        RealSubject realSubject = new RealSubject();

        //2.创建调用处理器对象
        ProxyHandler handler = new ProxyHandler(realSubject);

        //3.动态生成代理对象
        /**
         * 第一个参数是类加载器对象（即哪个类加载器来加载这个代理类到 JVM 的方法区）
         * 第二个参数是接口（表明你这个代理类需要实现哪些接口）
         * 第三个参数是调用处理器类实例（指定代理类中具体要干什么）
         *
         * 这个函数是 JDK 为了程序员方便创建代理对象而封装的一个函数，
         * 因此你调用newProxyInstance()时直接创建了代理对象（略去了创建代理类的代码）
         */
        Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), handler);

        //4.通过代理对象调用方法
        proxySubject.request();

    }

}
