
/**
 * 
 * 1st grade equation resolver.
 * 
 * @author angel
 *
 * 
 */

import java.util.Scanner;

public class exercise_5_4 {
	
	public static void main (String[]args){
		
		Scanner s = new Scanner (System.in);
		
		System.out.println ("1st grade equation resolver...");
		System.out.println ("Enter the value of a & b to resolve ax + b = 0: ");
		
		//Vars | Enter the value w/ keyboard.
		
		float a = Float.parseFloat (s.nextLine());
		float b = Float.parseFloat (s.nextLine());
		
		
		float operation = (-b)/(a); //Operation.
		
		System.out.println ("Result: " + operation ); // Print operation
		
		
	}
}
