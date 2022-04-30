
package Tut10.Mankind;

/**
 *
 * @author Cuon7
 */
public class Student extends Human {
    private String facultyNumber;
    
    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.length() <5 || facultyNumber.length()>10) {
            throw new IllegalArgumentException("Invalid Faculty Number");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Faculty Number: %s", this.getFacultyNumber()));
        return super.toString() + "\n " + sb.toString();
    }
    
    
    
}
