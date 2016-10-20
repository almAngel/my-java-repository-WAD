/**
*
*
* Exercise_4_3.
*
* Write a program with keyboard-input values. Then sum, subtract, multiply and divide them.
* 
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner.

public class exercise_4_3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
  
    // Vars.
  
    float number1;
    float number2;
  
    // User info.
  
    System.out.println ("Give me two numbers, I will do all the operations...");
    
    System.out.println ("Number 1: ");
    number1 = Float.parseFloat (s.nextLine()); // Insert: number1 value.
    
    System.out.println ("Number 2: ");
    number2 = Float.parseFloat (s.nextLine()); // Insert: number2 value.
    
    // Operations.
  
    float sum = number1 + number2;
    float subtract = number1 - number2;
    float multiply = number1 * number2;
    float divide = number1 / number2;
    
    // Result.
    
    System.out.printf (" Result: \n %-15s %10s \n %-15s %10s \n %-15s %10s \n %-15s %10s \n" , "Sum = ", sum ,"Substract =",subtract , "Multiply = ",multiply, "Divide = ",divide );
    
  
  }



}

