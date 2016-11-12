
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_21_5 {
  public static void main (String[]args){
    
    Scanner s= new Scanner(System.in);
    
    //Vars.
    boolean repeat= true;
    int howManyOddNumbers= 0;
    int howManyNumbers= 0;
    float aux1= 0;
    //---------------------------
    
    //Main loop.
    while (repeat){ 
      
      System.out.println("Introduce a number: [INTRODUCE A NEGATIVE NUMBER TO EXIT]");
      float number= Integer.parseInt(s.nextLine());
      System.out.println();//Line Jump.
      if (number%2== 1 && number > 0){ //Checking if it's an odd number or a pair number.
        howManyOddNumbers++;// Quantity of odd numbers +1.
      aux1+= number;//Overwriting values.
      }
      else if(number%2==0 && number > 0){
        System.out.println("Your number "+ number + " is a pair number.\n");
      }
      float average= aux1/howManyOddNumbers; //Average.
      
      if (number <0){
        repeat= false;
        
        System.out.println("########## TOTALS ##########");
        System.out.println("Total numbers= "+ howManyNumbers);
        System.out.println("Total odd numbers= "+ howManyOddNumbers);
        System.out.println("########## oooooo ##########\n");
        
        System.out.println("\nTHE PROGRAM HAS STOPPED WORKING");
        
        if (howManyOddNumbers==0){
          System.out.println ("There aren't odd numbers.");
        }
        else{
          System.out.println("\nOdd numbers' average= "+ average);
        }
        
      }
      else {
        // Quantity of numbers +1.
        howManyNumbers++;
        //------------------------------
      }
      
    }
  }
}
