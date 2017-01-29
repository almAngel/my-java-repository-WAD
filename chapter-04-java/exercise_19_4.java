
/**
 *
 * @author Ángel López Molina
 */

import java.util.Scanner;

public class exercise_19_4 {
 
  public static void main (String []args){
  
    Scanner s = new Scanner (System.in);
    
    
  System.out.println ("Do you want to know how many digits has a number?");
  System.out.println ("Easy, you just need to introduce your number here.");
  System.out.println ("It accepts from one to five digits and negative numbers.\n");
  System.out.println ("Introduce your number, please: ");
  
  int number = Integer.parseInt(s.nextLine());
  
    if (number < 10 && number > -10){ //One digit.
      System.out.println ("");//Blank.
      System.out.println ("Your number has one single digit.");
    
    }
    
    else if (number < 100 && number > -100){ //Two digit.
      System.out.println ("");//Blank.
      System.out.println ("Your number has two digits.");
    
    }
    
    else if (number < 1000 && number > -1000){ //Three digit.
      System.out.println ("");//Blank.
      System.out.println ("Your number has three digits.");
    
    }
    
    else if (number < 10000 && number > -10000){ //Four digit.
      System.out.println ("");//Blank.
      System.out.println ("Your number has four digits.");
    
    }
    
    else if (number < 100000 && number > -100000){ //Five digit.
      System.out.println ("");//Blank.
      System.out.println ("Your number has five digits.");
    
    }
    else {
      System.out.println ("");//Blank.
      System.out.println ("Your number has more than five digits.");}
  
  }
  
  
}
