package chapter_4_java.pack;

import java.util.Scanner; // Import Scanner.

public class exercise_7_4 {

	public static void main (String[]args){
		
		Scanner s = new Scanner (System.in); // Call Scanner.
		
		// Enter your first score.
		float score1 = Float.parseFloat(s.nextLine());
		// Enter your second score.
		float score2 = Float.parseFloat(s.nextLine());
		// Enter your third score.
		float score3 = Float.parseFloat(s.nextLine());
		
		// Operation.
		float average = (score1 + score2 + score3)/3;
		
		System.out.println ("Your average is: " + average); // Print Result.
		
		
	}
}
