package Tut10.Person;

/**
 *
 * @author Cuon7
 */
public class Person {
    private String name;
    private int age;    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) throws IllegalArgumentException {
        if(validateAge(age)) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Age must be positive");
        }
    }
    
    protected boolean validateAge(int age) {
        if(age > 1) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));
        return sb.toString();
    }
    
}

