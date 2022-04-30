package Tut08.Prototype;

import java.util.Hashtable;

/* Create the ShapeCache class to get concrete classes from database 
   and store them in a Hashtable. */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /*
	 * TO-DO: Implement the loadCache() method 
	 * For each shape run database query and
	 * create shape shapeMap.put(shapeKey, shape);
     */
    public static void loadCache() {
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);

        Square s = new Square();
        s.setId("2");
        shapeMap.put(s.getId(), s);

        Rectangle r = new Rectangle();
        r.setId("3");
        shapeMap.put(r.getId(), r);

    }
}
