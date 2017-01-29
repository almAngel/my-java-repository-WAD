
import java.util.Scanner;

/**
 *
 * Exercise_13_5
 * 
 * 
 * @author Ángel López Molina
 */
public class Exercise_13_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in);
    boolean repeat= true;
    boolean repeat2= true;
    int positives= 0;
    int negatives= 0;
    int number= 0;
    
    while (repeat){
      for (int i= 0; i < 10; i++){
        System.out.println ("Introduce a number: ");
        number= Integer.parseInt(s.nextLine());
        
        if (number != 0){
          if(number > 0){
            positives++;
          }
          else{
            negatives++;
          }
        }
        else{
          System.out.println ("0 is a neutral number");
          
        }
      }
      System.out.println("There is " +positives+" positive numbers"+" and "+negatives+" negative numbers.");
      
      while (repeat2){
      System.out.println ("Try again? [Y/N]");
      String choice= s.nextLine();
        
        if (choice.equalsIgnoreCase("y")){
          repeat= true;
          repeat2= false;
        }
        else if (choice.equalsIgnoreCase("n")){
          repeat= false;
          repeat2= false;
        }
        else{
          System.out.println ("Not a valid answer. Please, try again.");
        
        } 
    }
    }
    
  }
  
}
