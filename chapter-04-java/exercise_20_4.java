
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángel López Molina
 */
public class exercise_20_4 {
 
  public static void main (String []args){
   
    Scanner s = new Scanner (System.in);
    
    System.out.println ("Do you want to know if a number is capicua?");
    System.out.println ("Easy, you just need to introduce your number here.");
    System.out.println ("It accepts from one to five digits and negative numbers.\n");
    System.out.println ("Introduce your number, please: ");
  
    int number = Integer.parseInt(s.nextLine());

        
      if (number < 10 && number >= 0){ //One digit.
        System.out.println ("");//Blank.
        
        System.out.println ("Your number is capicua.");
        
      }
    
      else if (number < 100 && number >= 10){ //Two digits.
        System.out.println ("");//Blank.
       
        if (number%10 == number/10){
        System.out.println ("Your number is capicua");
        }else{System.out.println ("Your number is not capicua");}
      }
    
      else if (number < 1000 && number >= 100){ //Three digits.
        System.out.println ("");//Blank.
        
        if (number%10 == number/100){
        System.out.println ("Your number is capicua");
        }else{System.out.println ("Your number is not capicua");}
    
      }
    
      else if (number < 10000 && number >= 1000){ //Four digits.
        System.out.println ("");//Blank.

        if ((number%10 == number/1000) && ((number/100)%10) == ((number/10)%10)){
        System.out.println ("Your number is capicua");
        }else{System.out.println ("Your number is not capicua");}
        
      }
      else if (number < 100000 && number >= 10000){ //Five digits.
        System.out.println ("");//Blank.
        
        if ((number%10 == number/10000) && ((number/1000)%10) == ((number/10)%10)){
        System.out.println ("Your number is capicua");
        }else{System.out.println ("Your number is not capicua");}
    
      }
      else {
        System.out.println ("");//Blank.
        System.out.println ("Your number has more than five digits.");
      }
  }
}