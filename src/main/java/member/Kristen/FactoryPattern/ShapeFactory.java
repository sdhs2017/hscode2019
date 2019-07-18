package member.Kristen.FactoryPattern;
/*pros:
    1.with the help of the factory method (ShapeFactory) the client can create an object without knowing the exact class
    2. easy to add new products or limit the access of products in the facotry
 */
//to generate object of concrete class
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equals("no-edge")){
            return new Circle();

        } else if(shapeType.equals("trilateral")){
            return new Rectangle();

        } else if(shapeType.equals("quadrilateral")){
            return new Square();
        }

        return null;
    }
}