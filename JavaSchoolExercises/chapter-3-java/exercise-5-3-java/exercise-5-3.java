/**
*
*
* Exercise5x3.
*
* Make a program which calculates the area of a rectangle.
* 
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Insert Scanner.

public class Exercise5x3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User info.
    
    System.out.println ("Rectangle area calculator... ");
    
    System.out.println ("Enter side 1: ");
    
    float side1 = Float.parseFloat (s.nextLine()); // Insert: side1 value.
    
    System.out.println ("Enter side 2: ");
    
    float side2 = Float.parseFloat (s.nextLine()); // Insert: side2 value.
    
    float calculation = side1 * side2; // Operation.
    
    System.out.printf ("Result: %.4f %s" , calculation, "u²"); // Result.
    
    }
  
  
  }


