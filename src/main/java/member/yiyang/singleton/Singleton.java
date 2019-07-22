package member.yiyang.singleton;

import java.util.Random;

/*
* 单例模式
* 线程安全
*/
public enum Singleton {
    INSTANCE;// 这个就是单例的实例对象

    //定义要返回的对象及类型
    private static String someString;

    public void setData(String arg){
        Random r = new Random();
        someString = arg+r.nextFloat();
    }
    public String getSomeString() {
        return someString;
    }
}