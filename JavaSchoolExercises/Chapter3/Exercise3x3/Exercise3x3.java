/**
*
*
* Exercise3x3.
*
* Make a peseta-euro converter. The values must be inserted with the keyboard.
* 
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner.

public class Exercise3x3 {
  public static void main (String[]args) {
  
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User info.
    
    System.out.println ("Introduce the quantity of pesetas: ");
    float peseta = Float.parseFloat(s.nextLine()); // Insert: peseta value.

    System.out.printf ("Result: %.2f %s " , peseta / 166.386f, "€"); // Conversion and Result.
  }


}
