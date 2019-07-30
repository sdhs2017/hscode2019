package member.savilio.design_pattern.builder.demo2;

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
    public void setPart1(String part1) {
        this.part1 = part1;
    }
    public String getPart2() {
        return part2;
    }
    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + "]";
    }

}
