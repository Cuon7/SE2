package Tut08.Prototype;

// Create the Shape abstract class implementing Cloneable interface.
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    // TO-DO: Declare void abstract method: draw()
    abstract void draw();

    // TO-DO: Implement GETTERs & SETTERs methods for given attributes
    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
