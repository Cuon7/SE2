package Tut08.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Create the CourseInformation class to generate information about the duration 
 * and fee of the course by using the Admission class to get the object of 
 * sub-classes by passing the required information like the course being applied for */
class CourseInformation {
	public static void main(String args[]) throws IOException {
            
		//TO-DO: Create new Admission object
	 
		//TO-DO: Get user's input for the course's name
	 
		//TO-DO: Create new course with created Admission
		
		//TO-DO: Display the require duration in semesters, required fee per semester and for whole course
            Admission a = new Admission();
            System.out.print("Enter the course you are trying to admit in: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String courseName = br.readLine();
            Course c = a.admittingCourse(courseName);
            System.out.print("For  " + courseName + "  the required duration you would have to study is: ");
            c.getDuration();
            System.out.print("For  " + courseName + "  the required fee you would have to pay per semester is: ");
            c.getFeePerSemester();
            System.out.println("The total amount you will have to pay for the entire course duration is:");   
            c.calculateTotalFee();
	}
}  