
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class exercise_18_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce the first number: ");
    int number1= Integer.parseInt(s.nextLine());
    System.out.println("Introduce the second number: ");
    int number2= Integer.parseInt(s.nextLine());
    System.out.println("");//Blank.
    boolean repeat= true;
    
    while(repeat){
      for (int i = number1; i <= number2; i+=7){

        System.out.print(i+" ");
        repeat=false;
      } 
    }

  }
}
