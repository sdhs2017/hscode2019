package member.scy.designPatterns.factory.main;

import member.scy.designPatterns.factory.dao.Shape;
import member.scy.designPatterns.factory.factory.ShapeFactory;

/**
 * @program: hscode
 * @description: 测试类
 * @author: shichengyu
 * @create: 2019-07-17 20:14
 **/
public class Test {

    public static void main(String[] args) {
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }

}
