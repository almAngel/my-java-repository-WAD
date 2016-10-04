/**
*
*
* Exercise11x3.
*
* Make a kB to mB converter.
* 
* @author Ángel López Molina.
*
*
**/

//KB: 0.000977 MB.

import java.util.Scanner; // Importing Scanner.

public class Exercise11x3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner (System.in); // Calling Scanner.
    
    // Vars.
    
    float kB;
    float mB = 0.000977f;
    
    // User info.
    
    System.out.println ("MB to KB conversor... "); 
    
    System.out.println ("Enter the quantity in KB you want to conver: ");
    kB = Float.parseFloat (s.nextLine()); // Enter: kB.
    
    float operation = kB * mB; // Operation.
    
    
    System.out.printf ("Result: %f %s \n ", operation, "MB"); // Result.
    
    }
  
  
  }

