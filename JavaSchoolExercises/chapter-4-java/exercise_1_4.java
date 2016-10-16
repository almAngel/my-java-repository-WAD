
/**
 * 
 * 
 * Exercise_1_4.
 * 
 * It gives you the schedule of each day of the week.
 * Check out the code for more information. 
 * 
 * 
 * @author Ángel López Molina
 *
 */

import java.util.Scanner; //Imported lib for the Scanner.

public class exercise_1_4 {

	public static void main (String[]args) {
		
		//Calling the Scanner.
		
		Scanner s = new Scanner(System.in);
		
		//Strings for the user information.
		
		System.out.println ("Which is the schedule of the day?... ");
		
		System.out.println ("1. Monday");
		System.out.println ("2. Tuesday");
		System.out.println ("3. Wednesday");
		System.out.println ("4. Thursday");
		System.out.println ("5. Friday");
		System.out.println ("Enter one of the days for the result... (format:| Day) *Not number ");
		
		//Vars.
		
		String dayOfTheWeek = s.nextLine();
		
		//Switch method for the machine sorting.
		
		switch (dayOfTheWeek) {
			
			case "Monday": 
			
				System.out.println ("");
				System.out.printf ("%-15s %s \n","Hour:","Subject");
				System.out.printf ("%-15s %s \n","08:15 - 09:15", "S.INF");
				System.out.printf ("%-15s %s \n","09:15 - 10:15","S.INF");
				System.out.printf ("%-15s %s \n","10:15 - 11:15","S.INF");
				System.out.printf ("%-15s %s \n","11:15 - 11:45","RECREO");
				System.out.printf ("%-15s %s \n","11:45 - 12:45","F.O.L");
				System.out.printf ("%-15s %s \n","12:45 - 13:45","F.O.L");
				System.out.printf ("%-15s %s \n","13:45 - 14:45","F.O.L");
			
			
				break;
			
			case "Tuesday": 
				
				System.out.println ("");
				System.out.printf ("%-15s %s \n","Hour:","Subject");
				System.out.printf ("%-15s %s \n","08:15 - 09:15", "PROG");
				System.out.printf ("%-15s %s \n","09:15 - 10:15","PROG");
				System.out.printf ("%-15s %s \n","10:15 - 11:15","PROG");
				System.out.printf ("%-15s %s \n","11:15 - 11:45","RECREO");
				System.out.printf ("%-15s %s \n","11:45 - 12:45","B.D");
				System.out.printf ("%-15s %s \n","12:45 - 13:45","B.D");
				System.out.printf ("%-15s %s \n","13:45 - 14:45","B.D");
				
			
				break;
			
			case "Wednesday": 
				
				System.out.println ("");
				System.out.printf ("%-15s %s \n","Hour:","Subject");
				System.out.printf ("%-15s %s \n","08:15 - 09:15", "PROG");
				System.out.printf ("%-15s %s \n","09:15 - 10:15","PROG");
				System.out.printf ("%-15s %s \n","10:15 - 11:15","L.M");
				System.out.printf ("%-15s %s \n","11:15 - 11:45","RECREO");
				System.out.printf ("%-15s %s \n","11:45 - 12:45","L.M");
				System.out.printf ("%-15s %s \n","12:45 - 13:45","E.D");
				System.out.printf ("%-15s %s \n","13:45 - 14:45","E.D");
				
				
        break;
				
			case "Thursday": 
					
				System.out.println ("");
				System.out.printf ("%-15s %s \n","Hour:","Subject");
				System.out.printf ("%-15s %s \n","08:15 - 09:15", "B.D");
				System.out.printf ("%-15s %s \n","09:15 - 10:15","B.D");
				System.out.printf ("%-15s %s \n","10:15 - 11:15","B.D");
				System.out.printf ("%-15s %s \n","11:15 - 11:45","RECREO");
				System.out.printf ("%-15s %s \n","11:45 - 12:45","PROG");
				System.out.printf ("%-15s %s \n","12:45 - 13:45","PROG");
				System.out.printf ("%-15s %s \n","13:45 - 14:45","PROG");
					
				
        break;
					
			case "Friday": 
					
				System.out.println ("");
				System.out.printf ("%-15s %s \n","Hour:","Subject");
				System.out.printf ("%-15s %s \n","08:15 - 09:15", "L.M");
				System.out.printf ("%-15s %s \n","09:15 - 10:15","L.M");
				System.out.printf ("%-15s %s \n","10:15 - 11:15","E.D");
				System.out.printf ("%-15s %s \n","11:15 - 11:45","RECREO");
				System.out.printf ("%-15s %s \n","11:45 - 12:45","S.INF");
				System.out.printf ("%-15s %s \n","12:45 - 13:45","S.INF");
				System.out.printf ("%-15s %s \n","13:45 - 14:45","S.INF");
					
				
        break;
				
			//Default. If not -case x- then do something alternatively.
					
			default:  
				System.out.println ("You didn't introduce a valid day of the week");
		
        break;
		}
	}
}
