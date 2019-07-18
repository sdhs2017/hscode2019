package member.scy.designPatterns.factory.impl;

import member.scy.designPatterns.factory.dao.Shape;

/**
 * @program: hscode
 * @description: 正方形
 * @author: shichengyu
 * @create: 2019-07-17 20:11
 **/
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }

    public Square() {
        System.out.println("Square");
    }
}
