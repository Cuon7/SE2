
package Tut10.Mankind;

/**
 *
 * @author Cuon7
 */
public class Worker extends Human  {
    private double workHoursPerDay;
    private double weekSalary;
    
    public Worker(String firstName, String lastName, double workHoursPerDay, double weekSalary) {
        super(firstName, lastName);
        this.workHoursPerDay = workHoursPerDay;
        this.weekSalary = weekSalary;
        
    }
    
    @Override
    protected void setLastName(String lastName) {
        boolean isUpperCase = Character.isUpperCase(lastName.charAt(0));
        if (!isUpperCase) {
            throw new IllegalArgumentException("Expected upper case letter");
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length more than 3 symbols");
        }
        super.setLastName(lastName);

    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if(workHoursPerDay <1 || workHoursPerDay >12) {
            throw new IllegalArgumentException("Expected value mismatch");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 10 ) {
            throw new IllegalArgumentException("Expected value mismatch");
        }
        this.weekSalary = weekSalary;
    }
    
    public double getSalaryPerHour() {
        return weekSalary / (5*workHoursPerDay);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("Week Salary: %s, Hours per day: %s, Salary per hour: %s", this.getWeekSalary(), this.getWorkHoursPerDay(), getSalaryPerHour()));
        return super.toString() + "\n " + sb.toString();
    }
    
    
}
