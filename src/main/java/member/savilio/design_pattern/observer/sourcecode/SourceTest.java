package member.savilio.design_pattern.observer.sourcecode;

public class SourceTest {

    public static void main(String[] args) {

        Wolf wolf = new Wolf();

        Observer lazySheep = new LazySheep();
        lazySheep.setName("lazy");
        Observer smartSheep = new SmartSheep();
        smartSheep.setName("smart");

        wolf.attach(lazySheep);
        wolf.attach(smartSheep);


        wolf.invade();

        //躲避lazy羊观察，第二次出击
        wolf.detach(lazySheep);
        wolf.invade();
    }
}
