package member.yiyang.adapter;

/**
 * 目标接口（客户端需要使用的接口）
 */
public interface ITarget {
    //客户端需要请求处理的方法
    //不用public修饰，借口方法默认是public abstract
    void request();
}
