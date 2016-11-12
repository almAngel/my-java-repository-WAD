
import java.util.Scanner;

/**
 *
 * Exercise_9_5.
 * 
 * @author Ángel López Molina
 */
public class Exercise_09_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in);
    
    boolean repeat= true;
    
    while(repeat){
      
      boolean repeat2 = true;
      
      System.out.println("Introduce a number: ");
      long number= Long.parseLong(s.nextLine());
      
      int iter= 1;
      long number2 = number;
      
      while (number2 >= 10 || number2 <= -10){
        number2/=10;
        iter++;
      }
      System.out.println ("Your number " +number+" has "+iter+" digits");
      
      while(repeat2){
        
        System.out.println ("Repeat? [Y/N]");
        String choice= s.nextLine();
        
        if(choice.equalsIgnoreCase("y")){
          repeat2= false;
        }
        else if (choice.equalsIgnoreCase("n")){
          repeat= false;
          repeat2= false;
        }
        else{
          System.out.println ("Error. Introduce a valid answer");
        }
      }
      
    }
  }
}
