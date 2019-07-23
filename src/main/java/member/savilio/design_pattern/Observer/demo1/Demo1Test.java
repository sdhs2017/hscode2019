package member.savilio.design_pattern.Observer.demo1;

public class Demo1Test {

    public static void main(String[] args) {
        Antique stone = new Antique(1222f);

        People p1 = new People("p1");
        People p2 = new People("p2");
        People p3 = new People("p3");

        stone.addObserver(p1);
        stone.addObserver(p2);
        stone.addObserver(p3);

        System.out.println(stone.toString());
        stone.setPrice(111f);
        System.out.println(stone.toString());
    }
}
