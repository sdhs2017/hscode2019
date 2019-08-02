package member.yiyang.builder;

/**
 * 抽象建造类
 */
public abstract class Builder {
    abstract void buildEngine();
    abstract void buildWheel();
    abstract void buildFrame();
    abstract Car createCar();
}
