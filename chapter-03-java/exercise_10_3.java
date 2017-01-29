/**
*
*
* Exercise_10_3.
*
* Make a mB to kB converter.
*
* @author Ángel López Molina.
*
*
**/

// 1MB: 1024KB.

import java.util.Scanner; // Importing Scanner.

public class exercise_10_3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // Vars.
    
    int kB = 1024;
    int mB;
    
    // User Info.
    
    System.out.println ("MB to KB conversion... ");
    
    System.out.println ("Introduce the amount of MB you want to convert: ");
    mB = Integer.parseInt(s.nextLine()); // Insert: mB.
    
    int operation = mB * kB; // Operation.
    
    System.out.printf ("Result: %d %s", operation , "KB"); // Result.
    
    
    }
  
  
  }
