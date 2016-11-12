
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_23_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in); 
    int numbersIntroduced= 0;
    float sumNumbers= 0;
    boolean repeat= true;
    float average= 0;
    
    while (repeat){
      
      System.out.println("Introduce a number: [Limit: sumAll==10000]");
      int number= Integer.parseInt(s.nextLine());
      
      numbersIntroduced++;
      sumNumbers+=number;
      average= sumNumbers/numbersIntroduced;
      
      if (sumNumbers >10000){
        repeat= false;
        System.out.println("STOP");
        System.out.println("You introduced a total of "+ numbersIntroduced+ " numbers.");
        System.out.println("The result of the sum is: "+ sumNumbers);
        System.out.println("The average of these numbers is: "+ average);
      }
    }
    
    
    
  }
}
