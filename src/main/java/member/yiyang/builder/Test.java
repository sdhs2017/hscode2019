package member.yiyang.builder;

/**
 * 建造者模式与抽象工厂模式的比较:
 *
 * 与抽象工厂模式相比，建造者模式返回一个组装好的完整产品，而抽象工厂模式返回一系列相关的产品，这些产品位于不同的产品等级结构，构成了一个产品族 。
 * 在抽象工厂模式中，客户端实例化工厂类，然后调用工厂方法获取所需产品对象，而在建造者模式中，客户端可以不直接调用建造者的相关方法，而是通过指挥者类来指导如何生成对象，包括对象的组装过程和建造步骤，它侧重于一步步构造一个复杂对象，返回一个完整的对象 。
 * 如果将抽象工厂模式看成汽车配件生产工厂，生产一个产品族的产品，那么建造者模式就是一个汽车组装工厂，通过对部件的组装可以返回一辆完整的汽车
 */
public class Test {
    public static void main(String[] args) {
        showCar(new JiliCarBuilder());
        showCar(new BMWCarBuilder());
    }
    private static void showCar(Builder builder) {
        Seller seller = new Seller(builder);
        Car car = seller.construct();
        System.out.println(car.getFrame());
        System.out.println(car.getWheel());
        System.out.println(car.getEngine());
    }
}
