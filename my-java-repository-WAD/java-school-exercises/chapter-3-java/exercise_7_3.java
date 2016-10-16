/**
*
*
* Exercise_7_3.
*
* Write a program which calculates the total value of a shop bill. Then add taxes to it.
* 
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner.

public class exercise_7_3 {
  public static void main (String []args) {
    
    Scanner s = new Scanner (System.in); // Calling Scanner.
    
    // Vars.
    
    float taxes = 1.21f;
    
    // User info.
    
    System.out.println ("Bill generator... ");
    System.out.println ("Enter 5 product prices");
    
    System.out.println ("Article 1: ");
    float product1 = Float.parseFloat (s.nextLine()); // Insert: product1 value.
    
    System.out.println ("Article 2: ");
    float product2 = Float.parseFloat (s.nextLine()); // Insert: product2 value.
    
    System.out.println ("Article 3: ");
    float product3 = Float.parseFloat (s.nextLine()); // Insert: product3 value.
    
    System.out.println ("Article 4: ");
    float product4 = Float.parseFloat (s.nextLine()); // Insert: product4 value.
    
    System.out.println ("Article 5: ");
    float product5 = Float.parseFloat (s.nextLine()); // Insert: product5 value.
    
    float operation = (product1 + product2 + product3 + product4 + product5); // Operation.
    
    System.out.printf ("Base imponible: %.2f %s \n", operation, "€"); // Result without taxes.
    
    System.out.printf ("Result: %.2f %2s \n" , operation * taxes, "€"); // Result.
    
    }
  
  
  }
