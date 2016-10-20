
/**
 * 
 * Write a program that calculates the time travelled for an object,
 * counting with the distance there is between it's thrown, the moment 
 * it hits the ground and gravity.
 * 
 * Formula: time = Square root(2*height/gravity)
 * 
 * @autor Ángel López Molina
 * 
 */

import java.util.Scanner; // Import Scanner.

// Note: t² = 2h/g 

public class exercise_6_4 {

	
	
	public static float grav = 9.81f; // Const.
	
	public static void main (String[]args){
    
	Scanner s = new Scanner (System.in); // Call Scanner.
	
	System.out.println ("Calculate the time an object which travels between falling and hitting the ground...");
	System.out.println ("Introduce the height *h* value: ");
	
	float height = Float.parseFloat(s.nextLine()); // Insert the height.
	
	double operation = Math.sqrt((2* height)/grav); // Operation.
	
	System.out.printf ("Result: %.2f %s", operation, "secs."); // Print operation result.
	
	}
	
}

