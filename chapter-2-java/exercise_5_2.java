/**
*
*
* Exercise_5_2.
*
* Make a euro-peseta converter.
*
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner library.

public class exercise_5_2 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner (System.in); // Calling Scanner.
    
    // Vars.
    
    float euro = 0.006f;
    float peseta;
    
    // User info.
    
    System.out.println ("Peseta to euro conversor... ");
    System.out.println ("Enter the number of peseta you want to convert: ");
    
    peseta = Float.parseFloat(s.nextLine()); // Insert: peseta value.
    
    // Operation.
    
    float operation = peseta * euro;
    
    // Result.
    
    System.out.printf ("Result: %.2f %s \n",operation,"€");
    
    }

  
  }
