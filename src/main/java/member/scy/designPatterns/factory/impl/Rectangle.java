package member.scy.designPatterns.factory.impl;

import member.scy.designPatterns.factory.dao.Shape;

/**
 * @program: hscode
 * @description: 长方形
 * @author: shichengyu
 * @create: 2019-07-17 20:10
 **/
public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }


}
