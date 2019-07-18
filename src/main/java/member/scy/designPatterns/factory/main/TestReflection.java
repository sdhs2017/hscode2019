package member.scy.designPatterns.factory.main;

import member.scy.designPatterns.factory.factory.ShapeFactoryReflection;
import member.scy.designPatterns.factory.impl.Circle;
import member.scy.designPatterns.factory.impl.Rectangle;
import member.scy.designPatterns.factory.impl.Square;

/**
 * @program: hscode
 * @description: 反射机制工厂测试
 * @author: shichengyu
 * @create: 2019-07-17 20:33
 **/
public class TestReflection {

    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactoryReflection.getClass(Circle.class);
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactoryReflection.getClass(Rectangle.class);
        rectangle.draw();

        Square square = (Square) ShapeFactoryReflection.getClass(Square.class);
        square.draw();
    }
}
