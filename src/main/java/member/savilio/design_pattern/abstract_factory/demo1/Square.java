package member.savilio.design_pattern.abstract_factory.demo1;

/**
 * 正方形
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
