package member.scy.designPatterns.factory.impl;

import member.scy.designPatterns.factory.dao.Shape;

/**
 * @program: hscode
 * @description: 圆形测试
 * @author: shichengyu
 * @create: 2019-07-17 20:07
 **/
public class Circle implements Shape {

    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
