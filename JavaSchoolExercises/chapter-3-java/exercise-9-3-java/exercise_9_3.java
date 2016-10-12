/**
*
*
* Exercise_9_3.
*
* Make a program which calculates the volume of a cone.
* 
* @author Ángel López Molina.
*
*
**/

// NOTE: V = 1/3 πr*r h

import java.util.Scanner; // Import Scanner.

public class exercise_9_3 {
  
  static final float Pi = 3.1415f; //Constant.
  
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User info.
    
    System.out.println ("Cone volume calculator (radius,height): ");
    System.out.println ("Enter a radius: ");
    float r = Float.parseFloat (s.nextLine()); // Insert: Radius.
    
    System.out.println ("Enter a height: ");
    float h = Float.parseFloat (s.nextLine()); // Insert: Height.
    float volumeCal = (1/3f)* (Pi * r*r)*h; // Operation.
    
    System.out.printf ("Result: %.4f %1s" , volumeCal, "u²"); // Result.
    
    
    
  }
  
  
  
  }
