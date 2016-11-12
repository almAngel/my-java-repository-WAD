
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_11_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Introduce a number: ");
    double number= Double.parseDouble(s.nextLine());
    
    System.out.printf("%-10s %-10s %-10s\n","number","x²","x³");
    
    for(double iter= number; iter < number + 5; iter++){
      System.out.printf ("%f          %f         %d \n",iter,iter*iter,iter*iter*iter);
    }  
  }
}
