
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
    int aux1= 0;
    int aux2= 0;
    boolean repeat= true;
    
    while(repeat){
      for (int i = number1; i <= number2; i+=7){
        aux1= i;
        aux2= aux1;
        System.out.println(i+"+"+"7= "+(aux1));
      
        if (aux2 < number2){
          System.out.println("You couldn't reach "+number2+" per "+ (number2-aux2) +" numbers.");
          repeat= false;
        }
        else if (aux2 == number2){
          System.out.println("Success!");
          i= number2;
          repeat= false;
        }
        else if (aux2 > number2){
          System.out.println("You exceeded "+number2+" per "+(aux2-number2)+" numbers.");
          repeat= false;
        } 
      } 
    }

  }
}
