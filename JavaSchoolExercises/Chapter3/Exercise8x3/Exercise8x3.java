/**
*
*
* Exercise8x3.
*
* Write a program which calculates the salary of a employee, based in the worked hours.
*
* @author Ángel López Molina.
*
*
**/

//NOTE: 12€ /H.

import java.util.Scanner; // Import Scanner.

public class Exercise8x3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner(System.in); // Calling Scanner.
    
    // Vars.
    
    float moneyperhour = 12f;
    
    System.out.println ("Enter the hours you work per day: "); // It asks the hours you work per day.
    float hour = Float.parseFloat(s.nextLine()); // Hours input.
    
    float hourPerWeek = (hour * 5f); // It calculates the hours you work in a week, depending the hours you work supposedly.
    System.out.printf ("Hours per week: %.2f %s \n" , hourPerWeek, "hours."); // Print for check.
    
    float operation = hourPerWeek * moneyperhour; // It calculates the final result.
    
    
    System.out.printf ("Result: %.2f %2s \n", operation, "€"); // Result of the operation.
    
    }
  
  
  }
