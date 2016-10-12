/**
*
*
* Exercise_4_2.
* 
* Make a peseta-euro converter.
*
*
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner library.

public class exercise_4_2 {
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User Info.
    
    System.out.println ("Introduce the quantity to convert: ");
    
    // Vars.
    
    float euro = Float.parseFloat (s.nextLine()); // Insert: euro value.
  
    // Result.
  
    System.out.println ("Resultado: " + euro * 166.386f); 
    
  }

}
