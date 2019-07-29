package member.savilio.design_pattern.proxy.dynamic_proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理
 */
public class ProxyHandler implements InvocationHandler {

    private Subject subject;
    public ProxyHandler(Subject subject){
        this.subject=subject;
    }

    /**
     * 这个函数是在代理对象调用任何一个方法时都会调用的，方法不同会导致第二个参数method不同，
     * 第一个参数是代理对象（表示哪个代理对象调用了method方法），
     * 第二个参数是 Method 对象（表示哪个方法被调用了），
     * 第三个参数是指定调用方法的参数。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===before===");
        Object result = method.invoke(subject,args);
        System.out.println("===after===");
        return result;
    }
}
