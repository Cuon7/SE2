package Tut08.AbstractFactory;

//Create the RoundedSquare concrete class implementing the Shape interface.
public class RoundedSquare implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}
}
