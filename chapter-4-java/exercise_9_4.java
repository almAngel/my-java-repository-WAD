
/**
 * 
 * Write a program that calculates the value of x of a 2nd grade
 * equation.
 * 
 * 
 * 
 * @author Ángel López Molina 
 * 
 */

import java.util.Scanner; // Import Scanner.

public class exercise_9_4 {
	
	public static void main (String[]args){
		
		Scanner s = new Scanner(System.in); // Call Scanner.
		
    // User Info.
    
    System.out.println ("Quadratic equation solver... ");
    
    System.out.println ("Introduce the a value: ");
		double aValue = Double.parseDouble(s.nextLine()); // Introduce a value.
    
    System.out.println ("Introduce the b value: ");
    double bValue = Double.parseDouble(s.nextLine()); // Introduce b value.
    
    System.out.println ("Introduce the c value: "); 
    double cValue = Double.parseDouble(s.nextLine()); // Introduce c value.
    
    // The things inside the Square Root.
    
    double sqRoot = Math.sqrt((bValue*bValue) - 4f* ( (aValue) * (cValue)) ) ; 
    
    // Splits because you need to find both values.
    
    double x1Value = ((-(bValue)) + sqRoot)/ (aValue*2f); // (-b + ....)/2a
    
    double x2Value = ((-(bValue)) - sqRoot)/ (aValue*2f); // (-b - ....)/2a
    
    System.out.printf ("Result: %s %.5f %s %.5f \n","x1= ",x1Value,"x2= ",x2Value);
    
    
	}
}
