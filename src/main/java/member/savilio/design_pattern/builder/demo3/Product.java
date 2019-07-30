package member.savilio.design_pattern.builder.demo3;

/**
 * 产品
 */
public class Product {

    /**
     * 产品零件
     */
    private String part1 = "id:1001,RAM";
    private String part2 = "id:2001,CPU";

    public String getPart1() {
        return part1;
    }
//    public void setPart1(String part1) {
//        this.part1 = part1;
//    }
    public String getPart2() {
        return part2;
    }
//    public void setPart2(String part2) {
//        this.part2 = part2;
//    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + "]";
    }

    public Product(ConcreteBuilder builder){
        this.part1 = builder.part1;
        this.part2 = builder.part2;
    }


    /**
     * 静态内部类：建造者
     */
    public static class ConcreteBuilder{
        private String part1;
        private String part2;
        public ConcreteBuilder(String part1,String part2){
            this.part1=part1;
            this.part2=part2;
        }

        public ConcreteBuilder setPart1(String part1){
            this.part1=part1;
            return this;
        }
        public ConcreteBuilder setPart2(String part2){
            this.part2=part2;
            return this;
        }

        public Product getProduct(){
            return new Product(this);
        }


    }

}
