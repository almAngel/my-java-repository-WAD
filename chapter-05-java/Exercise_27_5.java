
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_27_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner (System.in);
    
    System.out.println("Make a program to check how much multiples of 3 there are between 1 and another number introduced via keyboard. Then, sum them all.\n");
    System.out.print("Introduce the number with which you want to limit the operation: ");
    long number= Long.parseLong(s.next());
    
    for(int i= 1; i <= number; i++){
      
      if(i%3==0){
        System.out.print(i+" is a multiple of 3\n");
      }
      else{
        System.out.println(i);
      }
    }
    
  }
}
