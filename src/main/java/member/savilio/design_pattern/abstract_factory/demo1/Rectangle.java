package member.savilio.design_pattern.abstract_factory.demo1;

/**
 * 矩形
 */
public class Rectangle implements Shape  {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
