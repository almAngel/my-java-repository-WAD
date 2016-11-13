
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_29_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce a number to check: ");
    int number1= Integer.parseInt(s.next());
    System.out.print("Introduce the other number: ");
    int number2= Integer.parseInt(s.next());
            
    if(number1>0 && number2>0){
      for (int i= 1; i <= number1 ; i++){
       
        if(i%number2 != 0){
          System.out.print(i+" ");
        }
      }
    } 
  }
}
