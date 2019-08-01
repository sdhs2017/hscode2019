package member.yiyang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理实现
 */
public class ExamHandler implements InvocationHandler {
    //被代理的实例
    Object obj = null;

    //要代理哪个实例
    public ExamHandler(Object obj) {
        this.obj = obj;
    }

    //调用被代理类方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
