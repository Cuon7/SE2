
package Tut10.Mankind;

/**
 *
 * @author Cuon7
 */
public abstract class Human {
    private String firstName;
    private String lastName;

    protected Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        boolean isUpperCase = Character.isUpperCase(firstName.charAt(0));
        if(!isUpperCase) {
            throw new IllegalArgumentException("Expected upper case letter");
        }
        if(firstName.length()<4) {
             throw new IllegalArgumentException("Expected length at least 4 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        boolean isUpperCase = Character.isUpperCase(lastName.charAt(0));
        if (!isUpperCase) {
            throw new IllegalArgumentException("Expected upper case letter");
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols");
        }
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s, Last Name: %d", this.getFirstName(), this.getLastName()));
        return sb.toString();
    }
    
    
    
    
}
