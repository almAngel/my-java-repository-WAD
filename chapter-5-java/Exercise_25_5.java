
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_25_5 {
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce the number you want to flip: ");
    long number= Long.parseLong(s.next());
    
    long flip=0; //Number flippled.
    
    while(number>0){ //While number/10 don't reach 0: 
      long aux= number;//aux is the number.
      flip= (flip*10)+(aux%10); //It assigns to flip the value of this operation.
      number/=10;//number shortens.
    }
    System.out.println(flip);//Show it.
  }
}