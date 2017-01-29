

/**
 *
 * @author Ángel López Molina
 */

import java.util.Scanner;

public class exercise_18_4 {
  
  public static void main (String [] args){
  
  Scanner s = new Scanner (System.in);
  
  System.out.println ("Do you want to know the first digit of a number?");
  System.out.println ("Easy, you just need to introduce your number here.");
  System.out.println ("It accepts from one to five digits and negative numbers.\n");
  System.out.println ("Introduce your number, please: ");
  
  int number = Integer.parseInt(s.nextLine());
  
    if (number < 10 && number > -10){ //One digit.
  
    int operation1 = number;
  
    System.out.println ("The first digit of your number is: " + operation1);
    
    }
    
    else if (number < 100 && number > -100){ //Two digits.
    
    int operation2 = (int)(number/10);  
      
    System.out.println ("The first digit of your number is: " + operation2);
    
    }
    else if ((number < 1000 && number > -1000)){ //Three digits.
    
    int operation3 = (int)(number/100);  
      
    System.out.println ("The first digit of your number is: " + operation3);
    
    }
 
    else if (number < 10000 && number > -10000){ //Four digits.
    
    int operation4 = (int)(number/1000);  
      
    System.out.println ("The first digit of your number is: " + operation4);
    
    }
    
    else if (number < 100000 && number > -100000){ //Five digits.
    
    int operation5 = (int)(number/10000);  
      
    System.out.println ("The first digit of your number is: " + operation5);
    
    }
    
    else {System.out.println ("Introduce a valid value please.");} // If it doesn't fulfill the conditions.
    
    
  }
  
}
