/**
*
*
* Exercise1x3.
* 
* Write a program which asks for two numbers, then multiply them and print the result.
*
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Importing Scanner.

public class Exercise1x3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // User info.
    
    System.out.println ("Multiply two numbers");
    System.out.println ("Enter the first number: ");
    float number1 = Float.parseFloat(s.nextLine()); // Insert: number1 value.
    
    System.out.println ("Enter the second number: ");
    float number2 = Float.parseFloat(s.nextLine()); // Insert: number2 value.
  
    float multiplicacion = number1 * number2; // Operation.
    
    System.out.printf ("Result: %.2f", multiplicacion); // Result.
  }
  
  



}
