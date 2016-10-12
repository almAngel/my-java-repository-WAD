/**
*
*
* Exercise_6_2.
*
* Write a program to calculate the total of a bill, and adds taxes to the base quantity.
*
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner library.

public class exercise_6_2 {
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    //Vars.
    
    float extra = 1.21f;
    
    // User info.
    
    System.out.println ("Total price calculator...");
    System.out.println ("Enter articles price... ");
    System.out.println ("Article 1 price: ");
    
      float article1 = Float.parseFloat (s.nextLine()); // Insert: article1 value.
      
    System.out.println ("Article 2 price: ");
    
      float article2 = Float.parseFloat (s.nextLine()); // Insert: article2 value.
      
    System.out.println ("Article 3 price: "); 
    
      float article3 = Float.parseFloat (s.nextLine()); // Insert: article3 value.
      
      // It calculates the final price of the whole purchase.
      
      float total = (article1 + article2 + article3); // Operation.
    
    System.out.printf ("Total (+IVA): %.2f %s", total * extra, "€" ); // Show total.
    
  } 


}
