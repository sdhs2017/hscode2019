package member.savilio.basic.generics.generics_interface;

public class GeneratorDemo {

    public static void main(String[] args) {
        Generator data = new FruitGenerator();
        System.out.println(data.next());    //null
        System.out.println(data.next2("string"));

        Generator data2 = new DataHolder();
        System.out.println(data2.next());
        System.out.println(data2.next2("string"));
    }

}
