
/**
 * 
 * 
 * 
 * 
 * 
 * 
 * @autor Ángel López Molina
 * 
 * 
 */


import java.time.LocalDate; // Import Local Date Value.
import java.util.Scanner; // Import Scanner.


public class exercise_8_4 {
	
	public static void main (String []args){
		
		Scanner s = new Scanner (System.in); // Call Scanner.
		
		// User info.
		
		System.out.println ("Your score's bulletin... ");
		
		System.out.println ("Enter your first name and surname: ");
		String entireName = s.nextLine();
		
		System.out.println ("Enter your grade: ");
		String grade = s.nextLine().toUpperCase();
		
		System.out.println ("Enter the first score: ");
		float score1 = Float.parseFloat(s.nextLine()); // Introduce first score.
		System.out.println ("Enter the second score: ");
		float score2 = Float.parseFloat(s.nextLine()); // Introduce second score.
		System.out.println ("Enter the third score: ");
		float score3 = Float.parseFloat(s.nextLine()); // Introduce third score.
		
		float operation = (score1 + score2 + score3 )/3; // Operation.
		
		
    // Print all the stuff.
    
    if (operation < 5 && operation >= 0){
      System.out.printf (" %s \n ", " ________________________________________");
      System.out.printf (" %s Student Name: %s \n ","|", entireName);
      System.out.printf (" %s Date: %s \n ", "|", LocalDate.now() );
      System.out.printf (" %s Grade: %s \n ", "|", grade);
      System.out.printf (" %s \n ", "|");
      System.out.printf (" %s Course's average score: %.2f | Sufficient score not reached; Insufficient \n ", "|", operation);
      System.out.printf (" %s \n ", "----------------------------------------");
  }
    else if (operation >= 5 && operation <= 6){
      System.out.printf (" %s \n ", " ________________________________________");
      System.out.printf (" %s Student Name: %s \n ","|", entireName);
      System.out.printf (" %s Date: %s \n ", "|", LocalDate.now() );
      System.out.printf (" %s Grade: %s \n ", "|", grade);
      System.out.printf (" %s \n ", "|");
      System.out.printf (" %s Course's average score: %.2f | Sufficient \n ", "|", operation);
      System.out.printf (" %s \n ", "----------------------------------------");
  }
    else if (operation >= 7 && operation <= 8){
      System.out.printf (" %s \n ", " ________________________________________");
      System.out.printf (" %s Student Name: %s \n ","|", entireName);
      System.out.printf (" %s Date: %s \n ", "|", LocalDate.now() );
      System.out.printf (" %s Grade: %s \n ", "|", grade);
      System.out.printf (" %s \n ", "|");
      System.out.printf (" %s Course's average score: %.2f | Remarkable \n ", "|", operation);
      System.out.printf (" %s \n ", "----------------------------------------");
  }
    else if (operation >= 9 && operation <= 10){
      System.out.printf (" %s \n ", " ________________________________________");
      System.out.printf (" %s Student Name: %s \n ","|", entireName);
      System.out.printf (" %s Date: %s \n ", "|", LocalDate.now() );
      System.out.printf (" %s Grade: %s \n ", "|", grade);
      System.out.printf (" %s \n ", "|");
      System.out.printf (" %s Course's average score: %.2f | Outstanding \n ", "|", operation);
      System.out.printf (" %s \n ", "----------------------------------------");
  }
    else {
      
      System.out.println ("Oops, enter a valid score, please... ");
      
      
    }
    
	}
}
