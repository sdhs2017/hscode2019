package member.Kristen.simpleFactoryPattern;
/*pros:
    1.with the help of the factory method (ShapeFactory) the client can create an object without knowing the exact class name
    for circle, the client could define it as "no-edge"
    2. easy to add new products or limit the access of products in the factory

  cons:
    1. does not support if each shape has different argument,
    (if Circle, and Rectangle's constructor take different argument then not work
    the Factory Method pattern will solve this problem since it will have multiple factories to group the similar class together

   2. every time you add a new class, you need to add it to the factory too
   but for this, non of the other type of the factory pattern can actually help. you either need to add it to the factory
   or create new factory for this class
 */
//to generate object of concrete class
public class ShapeFactory {

    //use getShape method to get object of type shape
    //can also to switch to implement this method
    //can use type 1,2,3 to replace "no-edge", "trilateral" , and "quadrilateral"
    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equals("trilateral")){
            return new Rectangle();

        } else if(shapeType.equals("quadrilateral")){
            return new Square();
        }

        return null;
    }

}