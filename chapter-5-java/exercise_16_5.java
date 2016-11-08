
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */

public class exercise_16_5 {
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    boolean repeat= true;
    boolean end= false;
    int check= 1;
    
    while (repeat){ //To do: Fix reset system.
      
      System.out.println("Introduce a number to check if it's a prime number:");
      int number= Integer.parseInt(s.nextLine());
      
      for(int i= 2; i < number; i++){
        if(number%i==0){
        check= 0;
        }
        
      }
      if (check== 1){
        System.out.println("Your number "+number+" is a prime number.");
      }
      else{
        System.out.println("Your number "+number+" is not a prime number.");
      }  

    
    }
  
  }
}
