package Tut08.Factory;

// Create the abstract class called Course
abstract class Course {
	protected int duration; //in semesters
	protected double fee; //in dollars ($)

	// TO-DO: Declare 2 void abstract methods: getDuration(), getFeePerSemester()

	// TO-DO: Declare void method: calculateTotalFee(). Total = duration * fee
        
        abstract void getDuration();
        abstract void getFeePerSemester();
        
        public void calculateTotalFee() {
            System.out.println(duration*fee);
        }

}