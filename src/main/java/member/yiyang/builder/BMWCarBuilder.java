package member.yiyang.builder;

/**
 * 宝马汽车组装类
 */
public class BMWCarBuilder extends Builder{
    private Car car = new Car();

    @Override
    void buildEngine() {
        car.setEngine("宝马汽车发动机");
    }

    @Override
    void buildWheel() {
        car.setWheel("宝马汽车轮子");
    }

    @Override
    void buildFrame() {
        car.setFrame("宝马汽车架子");
    }

    @Override
    Car createCar() {
        return car;
    }
}
