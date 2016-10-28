
import java.util.Scanner;

/**
 *
 * exercise_7_5
 * 
 * @author Ángel López Molina
 */

public class exercise_7_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner (System.in); //Calls the scanner.
    
    //User info.
    
    System.out.println ("Safe-deposit box");
    
    //If the condition doesn't match, then it starts again.
    for (int attempt = 1; attempt <= 4; attempt++){
    
      //User info+.
      System.out.println ("Introduce the password: ");
      int number = Integer.parseInt(s.nextLine());//Introduce the number.
      
      if (number != 5603){ //If the number is not correct, then repeat the loop.
      
        if (number < 10000 && number > 0){ //If the number has 4 digits and it's higher than 0 then:
          
          System.out.println ("Invalid password, please enter a valid number combination. Attempt " + attempt + " of 4");
          
          System.out.println ("Do you want some hints?[Y/N]");//User info++.Asking for hints.
          String yesNo = s.nextLine();
          
            if (yesNo.equalsIgnoreCase("y")){
            
              if (number/1000 == 5){System.out.println ("The first number is correct.");}
              else {System.out.println ("Hint: The first number is the result of (900/45)/4");}
              
              if ((number/100)%10 == 6){System.out.println ("The second digit is correct.");}
              else{System.out.println ("Hint: The second number's value is 6.");}
              
              if ((number/10)%10 == 0){System.out.println ("The penultimate number is correct.");}
              else {System.out.println ("Hint: The penultimate number's value is nothing.");}
              
              if (number%10 == 3){System.out.println("The last digit is correct.");}
              else{System.out.println("Hint: The last digit is the result of= 9 MOD 6");}
             
            }
            else {System.out.println ("As you please.");}
          
        }else{System.out.println ("Invalid number, please enter a four digits number.");}//If the number has more than 4 digits or it's below 0.
      }
      else { 
      
        System.out.println ("Correct, you can check your financial status.");
      
        break;
      }
      
    }
        
  }
  
}
