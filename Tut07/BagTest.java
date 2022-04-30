package Tut07;

/**
 *
 * @author Cuon7
 */
public class BagTest {
 	public static void main(String[] args) {
		//Bag with default size
		System.out.println("Testing an initially empty bag with " + " the capacity to hold at least 6 strings:");
		BagInterface<String> aBag = new ArrayBag<>();
		String[] contentsOfBag1 = { "A", "A", "B", "A", "C", "A", "H" };
		testAdd(aBag, contentsOfBag1);

		System.out.println("Bag is empty: " + aBag.isEmpty());
		System.out.println("Current bag size: " + aBag.getCurrentSize());

		System.out.println("B was removed from the bag: " + aBag.remove("B"));
		System.out.println("Z was removed from the bag: " + aBag.remove("Z"));

		displayBag(aBag);

		System.out.println("Removing an entry : " + aBag.remove());

		displayBag(aBag);
		
		System.out.println("The letter A occurs in the string " + aBag.getFrequencyOf("A") + " times.");
		System.out.println("The letter M occurs in the string " + aBag.getFrequencyOf("M") + " times.");
		
		
		System.out.println("The bag contains the letter A: " + aBag.contains("A"));
		System.out.println("The bag contains the letter M: " + aBag.contains("M"));
		
		System.out.println("The bag will now be cleared.");
		aBag.clear();
		
		
		// Bag with desired size
		System.out.println("\nTesting an initially empty bag that " + " will be filled to capacity:");
		aBag = new ArrayBag<>(7);
		String[] contentsOfBag2 = { "A", "B", "A", "C", "B", "C", "D", "another string" };
		testAdd(aBag, contentsOfBag2);
		
		System.out.println("Bag is empty: " + aBag.isEmpty());
		System.out.println("Current bag size: " + aBag.getCurrentSize());

		System.out.println("C was removed from the bag: " + aBag.remove("C"));
		System.out.println("Z was removed from the bag: " + aBag.remove("Z"));

		displayBag(aBag);

		System.out.println("Removing an entry : " + aBag.remove());

		displayBag(aBag);
		
		System.out.println("The letter A occurs in the string " + aBag.getFrequencyOf("A") + " times.");
		System.out.println("The letter S occurs in the string " + aBag.getFrequencyOf("S") + " times.");
		
		System.out.println("The bag contains the letter A: " + aBag.contains("A"));
		System.out.println("The bag contains the letter S: " + aBag.contains("S"));
		
		System.out.println("The bag will now be cleared.");
		aBag.clear();

	} 


	private static void testAdd(BagInterface<String> aBag, String[] content) {
		System.out.print("Adding the following " + content.length + " strings to the bag: ");
		for (int index = 0; index < content.length; index++) {
			if (aBag.add(content[index]))
				System.out.print(content[index] + " ");
			else
				System.out.print("\nUnable to add " + content[index] + " to the bag.");
		} 
		System.out.println();

		displayBag(aBag);
	} 


	private static void displayBag(BagInterface<String> aBag) {
		System.out.println("The bag contains the following string(s):");
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++) {
			System.out.print(bagArray[index] + " ");
		} // end for

		System.out.println();
	} 
} 