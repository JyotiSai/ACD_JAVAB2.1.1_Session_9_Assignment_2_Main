package session9assignments; //Package declaration

import java.util.HashSet; //Importing HashSet class from java.util package
import java.util.Set; //Importing Set class from java.util package

/**
 * This class copies all the elements from set2 to set1 so that the set1 becomes
 * the union of set1 and set2.
 *
 */
public class CopySetUnion {
	public static void main(String[] args) // This is main method
	{
		Set<String> set_1 = new HashSet<String>(); // Set interface declaration used to store first set of elements
		set_1.add("One"); // Adding elements
		set_1.add("Two");
		set_1.add("Three");

		Set<String> set_2 = new HashSet<String>(); // Set interface declaration used to store second set of elements
		set_2.add("1"); // Adding elements
		set_2.add("2");
		set_2.add("3");

		set_1.addAll(set_2); // set1 as a union of set1 and set2
		System.out.println("The new collection is:");
		System.out.println(set_1); // Prints set1
	} // End of main method
} // End of class
