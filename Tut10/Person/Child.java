package Tut10.Person;

/**
 *
 * @author Cuon7
 */
public class Child extends Person{
    
    public Child(String name, int age) {
        super(name, age);
    }
    
    public Child() {
        
    }
    
   @Override 
    protected void setAge(int age){
        if(validateAge(age)) {
            super.setAge(age);
        }else {
            throw new IllegalArgumentException("Child age must be smaller than 15");
        }
    } 
    
    @Override
    protected boolean validateAge(int age) {
        if(age < 15) {
            return true;
        }else {
            return false;
        }
    }
    
}


