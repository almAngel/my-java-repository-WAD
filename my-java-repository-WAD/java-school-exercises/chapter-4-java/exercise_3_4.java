
import java.util.Scanner; //Call the Scanner library.

/**
 * 
 * Write a program that, introducing a number it tells you 
 * which day of the week is it. Ex: 1 = Monday.
 * 
 * 
 * 
 * @author Ángel López Molina 
 * 
 */

public class exercise_3_4 {

	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		//Info for user.
		
		System.out.println ("Enter a number [1 -7] if you want to know which day of the week is... ");
		
		//Vars.
		
		int day = Integer.parseInt(s.nextLine());
		
		//Sorting.
		
		switch (day) {
		
		case 1: 
			
			System.out.printf ("The day %s is: Monday",day);
			
			break;
			
		case 2: 
			
			System.out.printf ("The day %s is : Tuesday",day);
		
			break;
			
		case 3:	
		
			System.out.printf ("The day %s is: Wednesday",day);
			
			break;
			
		case 4:
			
			System.out.printf ("The day %s is: Thursday",day);
			
			break;
			
		case 5:
			
			System.out.printf ("The day %s is: Friday",day);
			
			break;
			
		case 6:
			
			System.out.printf ("The day %s is: Saturday",day);
			
			break;
			
		case 7:
			
			System.out.printf ("The day %s is: Sunday",day);
			
			break;
			
		}
	}
	
}
