
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_15_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce a number and an exponent. Next, the program will show you all the possible ^powers");
    System.out.println("Please, introduce the base number: ");
    double number= Double.parseDouble(s.nextLine());
    System.out.println("Please, introduce the power to elevate your number: ");
    double powF= Double.parseDouble(s.nextLine());
    int result= 1;
    int pow= 1;
    
    if(number> 0){
      if (pow >0){
        System.out.println("\nResult: \n");
        for (int iter= 1; iter <= powF; iter++){
          result= 1;
          pow= iter;
          
          System.out.println((int)number+"^"+iter);
                  
          for(int j= 1; j <= pow; j++){
            result*= number;
          }
        }
        System.out.println("\n"+(int)number+"^"+(int)pow+"= "+result);
      }
      else if(pow==0){
        System.out.println("\nResult: 1");
        System.out.println("The exponent value must be greater than zero.");
      }
      else{
        System.out.println("ERROR.Introduce a positive value for the exponent.");
      }
    }
    else if (number==0){
      if (pow< 0){
        System.out.println("ERROR. Introduce a positive value for the exponent.");
      }
      else{
        System.out.println("\nResult: 0");
        System.out.println("Your base number is zero, so it doesn't matter if you introduce a valid exponent, the final result will be 0.");
      }
    }
    else {
      System.out.println("ERROR. The program doesn't recognise negative base numbers.");
    
    }
    
  }
}
