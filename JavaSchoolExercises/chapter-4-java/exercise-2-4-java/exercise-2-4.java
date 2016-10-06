package Chapter4.Exercise2x4;

/**
 * 
 *Exercise2x4.
 *
 *It says something depending of the hour introduced.
 *Check out the code for more information.
 * 
 * 
 * @author Ángel López Molina
 *
 *
 */

import java.util.Scanner; //Import Scanner lib.

public class Exercise2x4 {

	public static void main (String[]args) {
		
	  //Calling the Scanner.
		Scanner s = new Scanner(System.in);
		
		
		//Strings for the user information.
		
		System.out.println ("Virtual Assistant. Hello, identify yourself... ");
		
		//Vars.
		
		String user = (s.nextLine()); //Enter the name.
		
		//The program.
		//Check things like the name and the current hour. Then it talks.
		
		if (user.equals("Ángel")) {
			
		System.out.printf ("¡Hello %s! what time is it?... \n",user);
		System.out.println ("Enter the current hour... (format:| 6 -> 12 -> 20 -> 30 - Valid float values ex: 10.30)");
		
		float hour = Float.parseFloat(s.nextLine());
		
		if (hour >= 06 && hour <= 12){
		
			System.out.printf ("Good Morning %s! \n", user);
			
		}
		else if (hour >= 12 && hour <= 20){
			
			System.out.printf ("Good Afternoon %s! \n", user);
		
		}
		else if (hour >=20 && hour <= 30){ //30 is 06 again.
			
			System.out.printf ("Good Night %s! \n", user);
			
		}
		
		}
		else System.out.println ("Well, I don't know you. Should we meet someday?");
		
		
		}
		
	} 
	
