
/**
 *
 * @author Ángel López Molina
 */

import java.util.Scanner;

public class exercise_17_4 {
  
  public static void main (String[]args){
  
  Scanner s = new Scanner (System.in);
    
  System.out.println ("You want to know the last digit of a number?");
  System.out.println ("Easy,you just need to introduce your number to know it. \n");
  
  System.out.println ("Introduce the number, please: \n");
  
  int number = Integer.parseInt(s.nextLine());
  
  int operation = number%10;
  
  System.out.println ("This is the last digit of your number: " + operation);
  
  
  }
  
  
  
}
