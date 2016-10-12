/**
*
*
* Exercise_2_3.
*
* Make a euro-peseta converter, the values must be inserted with the keyboard.
*
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner.

public class exercise_2_3 {
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User info.
    
    System.out.println ("Introduce the quantity to convert: ");
    float euro = Float.parseFloat (s.nextLine()); // Insert: euro value.
    
  
    System.out.printf ("Resultado: %.2f %s" , euro * 166.386f, "pesetas."); // Conversion and Result.
    
  }

}
