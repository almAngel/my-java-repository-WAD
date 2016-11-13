
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_28_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Write a program to calculate the factorial number of another one introduced via keyboard.\n");
    System.out.print("Introduce the number: ");
    long number= Long.parseLong(s.next());
    long aux1= 1;
    long aux2= 1;
    
    for(long i= 1; i <= number; i++){
      aux2*= aux1;
      aux1++;
    }
    
    System.out.println("Factorial number of "+number+": "+aux2);
  }
}
