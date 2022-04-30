package Tut08.AbstractFactory;

/* Create ShapeFactory class extending AbstractFactory to generate 
 * object of concrete class based on given information. 
 */

public class ShapeFactory extends AbstractFactory {
    // TO-DO: Implement the getShape() method

    @Override
    public Shape getShape(String shapeType) {
        /*
		 * check for the shape type is equal to 'Rectangle' or 'Square' (ignore case)
		 * then return the corresponding type
         */
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();

        }
        return null;
    }
}
