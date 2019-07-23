package member.Kristen.simpleFactoryPattern;

public class Circle implements Shape {
    int radians;
    //overriding draw()
    public Circle (int r){
        radians=r;
    }


    public void draw() {

        System.out.println("Inside Circle::draw() method.");
    }
}