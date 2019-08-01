package member.yiyang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 扩展：AOP面向界面编程 //TODO
 */
public class Test {
    public static void main(String[] args) {
        //定义一个玩家
        IExam exam = new FinalExam("张艺阳");
        //定义一个handler
        InvocationHandler handler = new ExamHandler(exam);
        //获得类的ClassLoader
        ClassLoader cl = exam.getClass().getClassLoader();
        //动态产生一个代理者
        IExam proxy = (IExam) Proxy.newProxyInstance(cl, new Class[]{IExam.class}, handler);

        //开始打游戏
        System.out.println("-----------开始考试-----------");

        proxy.InRoom();
        proxy.Math();
        proxy.English();
        //记录游戏结束时间
        System.out.println("--------考试结束---------");
    }
}
