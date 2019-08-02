package member.yiyang.builder;

/**
 * 吉利汽车组装类
 */
public class JiliCarBuilder extends Builder{
    private Car car = new Car();

    @Override
    void buildEngine() {
        car.setEngine("吉利汽车发动机");
    }

    @Override
    void buildWheel() {
        car.setWheel("吉利汽车轮子");
    }

    @Override
    void buildFrame() {
        car.setFrame("吉利汽车架子");
    }

    @Override
    Car createCar() {
        return car;
    }
}
