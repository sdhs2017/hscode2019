package member.scy.designPatterns.factory.factory;

import member.scy.designPatterns.factory.dao.Shape;
import member.scy.designPatterns.factory.impl.Circle;
import member.scy.designPatterns.factory.impl.Rectangle;
import member.scy.designPatterns.factory.impl.Square;

/**
 * @program: hscode
 * @description: 工厂测试类
 * @author: shichengyu
 * @create: 2019-07-17 20:13
 **/
public class ShapeFactory {

    /** 
    * @Description:  静态工厂方法测试
    * @Param: [shapeType] 
    * @return: member.scy.designPatterns.factory.dao.Shape 
    * @Author: shichengyu 
    * @Date:2019/7/17 20:17
    */ 
    // 使用 getShape 方法获取形状类型的对象
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return Circle::new;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
