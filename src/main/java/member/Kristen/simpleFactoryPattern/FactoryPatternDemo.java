package member.Kristen.simpleFactoryPattern;


public class FactoryPatternDemo {

    public static void main(String[] args) {
        //ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        // to call static method:lassName.methodName (don't need to make an object of ShapeFactory
        Shape shape1 = ShapeFactory2.getShape("no-edge");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and cal l its draw method.
        Shape shape2 = ShapeFactory.getShape("trilateral");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = ShapeFactory.getShape("quadrilateral");//user does not know he creates a rhombus or a square

        //call draw method of square
        shape3.draw();
    }
}