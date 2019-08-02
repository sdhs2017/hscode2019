package member.yiyang.builder;

/**
 * 销售
 */
public class Seller {
    private Builder builder = null;
    public Seller(Builder builder){
        this.builder = builder;
    }
    public Car construct(){
        builder.buildEngine();
        builder.buildFrame();
        builder.buildWheel();
        return builder.createCar();
    }
}
