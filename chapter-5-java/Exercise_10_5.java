
import java.util.Scanner;

/**
 *
 * Exercise_10_5
 * 
 * 
 * @author Ángel López Molina
 */
public class Exercise_10_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in);
    
    boolean repeat= true;
    boolean stop= false;
    double numbersIn= 0;
    double number= 0;
    double number2= 0;
    
    while (repeat){
      
      while(number >= 0){
        System.out.println("Introduce a number: ");
        number= Double.parseDouble(s.nextLine());
        if (number >=0){
          numbersIn++;
          System.out.println(number+"+"+ number2+"="+(number2+=number));
          System.out.println(numbersIn+ " number/s introduced.");
        }else{
          repeat= false;
        }
      }
      System.out.println (number2+"/"+numbersIn+"= "+ (number2/numbersIn)+" --> This is the average of this numbers");
    }
      
  }
     
}
