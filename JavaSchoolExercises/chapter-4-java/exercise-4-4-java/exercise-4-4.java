package Chapter4.Exercise4x4;

/**
 * 
 * Exercise 4x4.
 * 
 * Make a salary calculator. Keep in mind that below 40 hours of work are paid for 12€/h.
 * Above 40 hours are paid 16€/h.
 * 
 * 
 * 
 * @author Ángel López Molina
 * 
 * 
 */

import java.util.Scanner; // Import the Scanner library.

public class Exercise4x4 {
	
public static Scanner s = new Scanner(System.in); // Calling the Scanner.
	
	//Variables.
	
	private static class Vars{
		
		private static float salary1 = 12f;
		private static float salary2 = 16f;
		
		public static float hours;
		public static float extraHours;
		
		public static float operation;
		public static float operation2;
		public static float operation3;
		
	}
	
	
	public static void main (String[]args){
	
		// User info.
		
		System.out.println ("Standart (and extra) salary calculator...");
		System.out.println ("Enter the number of hours you work per week:");
		System.out.println ("It can be: [x < 40 > y]");
		
		Vars.hours = Float.parseFloat(s.nextLine()); // Insert: hours value.
		
		// Conditional:
		
		if (Vars.hours == 40f){  // If you work < 40h, you will earn 12€/h.
			
			Vars.operation = Vars.hours * Vars.salary1;
			
			System.out.printf ("Result: %.2f %s \n",Vars.operation,"€");
			
		}
		else { // Here it splits.
			
			if (Vars.hours > 40f) { // If hours > 40 then extraHours are multiplied by the > 40h salary. 
				
			System.out.println ("Oh, it seems you work more than 40 hours. Enter the number of extra hours...");
			System.out.println ("Then, extra hours' salary will sum with your normal 8 hours salary...");
			
			Vars.extraHours = Float.parseFloat(s.nextLine()); // Insert: extraHours value.
			
			Vars.operation2 = (Vars.extraHours* Vars.salary2); // Operation.
			
			System.out.printf("Result: %.2f %s \n",Vars.operation2 + 480f, "€"); // Print hours > 40 result.
			}
			
			else if (Vars.hours < 40f){ // If hours < 40 then hours are multiplied by the < 40 salary.
				
			System.out.println ("You worked under the standart week work time...");
			
			Vars.operation3 = Vars.hours * Vars.salary1; // Operation.
				
			System.out.printf ("Result: %.2f %s \n", Vars.operation3,"€"); // Print hours < 40 result.
			
			}
		}
	}
}