
/**
 *
 * Make a program which calculates the average score of three scores 
 * introduced by keyboard.
 * 
 * 
 * 
 * @author Ángel López Molina
 * 
 */

import java.util.Scanner; // Import Scanner.

public class exercise_7_4 {

	public static void main (String[]args){
		
		Scanner s = new Scanner (System.in); // Call Scanner.
    
    System.out.println ("Enter your first score: ");
		float score1 = Float.parseFloat(s.nextLine()); // Enter your first score.
    
		System.out.println ("Enter your second score: ");
		float score2 = Float.parseFloat(s.nextLine()); // Enter your second score.
		
    System.out.println ("Enter your third score: ");
		float score3 = Float.parseFloat(s.nextLine()); // Enter your third score.
		
		float average = (score1 + score2 + score3)/3; // Operation.
		
		System.out.printf ("Your average score is: %.2f " , average); // Print Result.
		
		
	}
}
