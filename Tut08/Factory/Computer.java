package Tut08.Factory;

// Create the Computer class that extends Course abstract class 
class Computer extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
            duration = 7;
            System.out.println(duration);
 
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public void getFeePerSemester() {
            fee = 1000;  
            System.out.println(fee);
 
	}
} 
