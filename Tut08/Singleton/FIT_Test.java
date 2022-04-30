package Tut08.Singleton;

//Create the FIT_Test for testing purpose
public class FIT_Test {
	//TO-DO: Implement the main() method
	public static void main(String args[]) {
		//Create 2 new instances (objects) by calling getInstance() method

		//With 1st instance, display given text in upper case
 
		//With 2nd instance, display given text in lower case
	FIT instance = FIT.getInstance();
            String text = instance.text;
            System.out.println("Upper case String: " + instance.toUpper(text));
            System.out.println("Lower case String: " + instance.toLower(text));
            

	}
}
