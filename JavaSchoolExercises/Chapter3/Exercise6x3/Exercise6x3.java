/**
*
*
* Exercise6x3.
*
* Make a program which calculates the area of a triangle.
* 
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner.

public class Exercise6x3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User info.
    
    System.out.println ("Triangle area calculator... ");
    
    System.out.println ("Enter the base value ");
    float base = Float.parseFloat (s.nextLine()); // Insert: base value.
    
    System.out.println ("Enter the height ");
    float height = Float.parseFloat (s.nextLine()); // Insert: height value.
    
    float operation = (base * height)/2 ; // Operation.
    
    System.out.printf ("Result: %.4f %s " , operation, "u²"); // Result.
    
    }
  
  
  
  } 
