package Chapter4.Exercise3x4;


import java.util.Scanner; //Call the Scanner library.

public class Exercise3x4 {

	public static void main (String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		//Info for user.
		
		System.out.println ("Enter a number [1 -7] if you want to know which day of the week is... ");
		
		//Vars.
		
		int day = Integer.parseInt(s.nextLine());
		
		//Sorting.
		
		switch (day) {
		
		case 1: 
			
			System.out.println ("Monday");
			
			break;
			
		case 2: 
			
			System.out.println ("Tuesday");
		
			break;
			
		case 3:	
		
			System.out.println ("Wednesday");
			
			break;
			
		case 4:
			
			System.out.println ("Thursday");
			
			break;
			
		case 5:
			
			System.out.println ("Friday");
			
			break;
			
		case 6:
			
			System.out.println ("Saturday");
			
			break;
			
		case 7:
			
			System.out.println ("Sunday");
			
			break;
			
		}
	}
	
}
