
import java.util.Scanner;

/**
 *
 * Exercise_14_5
 * 
 * 
 * @author Ángel López Molina
 */
public class exercise_14_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner (System.in);
    
    System.out.println("Introduce a number: ");
    double number= Double.parseDouble(s.nextLine());
    System.out.println("Introduce an exponent: ");
    double exp= Double.parseDouble(s.nextLine());
    double result= 1;
    
    if (exp== 0){
      result=1; 
    }
    else if(exp < 0){
      for(int i= 0; i< -(exp);i++){
        result*= number;
      }
      result= 1/result;
    }
    else{
      for (int j= 0; j< exp; j++){
        result*= number; 
      }
    }
    System.out.println("Result: "+(double)result);
  }
  
}
