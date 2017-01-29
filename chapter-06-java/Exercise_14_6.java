
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_14_6 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    System.out.println("Think a number, then I will try to guess it. \n");
    
    int chances= 10;
    boolean repeat= true;
    boolean repeat2= true;
    boolean repeat3= true;
    int stRange= 0;
    int ndRange= 100;
    /*
    System.out.println("(Store your number now)");
    int storeNumber= Integer.parseInt(s.nextLine());
    */
    
    for (int i = 1; i <= chances && repeat; i++) {
      int number= (int)(Math.random()*(ndRange- stRange))+ stRange;
      System.out.print(" Attempt: " +i +"\n");
      System.out.println("Is this number the one you thought before?: "+ number +"\n [Y/N]");
      String choice= s.nextLine();
      repeat2= true;
      repeat3= false;
      
      while (repeat2){ //First reset.
        if(choice.equalsIgnoreCase("y")){
          System.out.println("Yes! Im the best!");
          repeat= false;
          repeat2= false;
        }
        else if (choice.equalsIgnoreCase("n")){
          System.out.println("The number you thought before is lower or higher than mine? ");
          String answer= s.nextLine();
          repeat3= true;
          
          while (repeat3){// Second reset.
            if (answer.equalsIgnoreCase("lower")){
              ndRange= number-1;
              repeat3= false;
            }
            else if (answer.equalsIgnoreCase("higher")){
              stRange= number+1;
              repeat3= false;
            }
            else{
              System.out.println("Repeat it, please. I couldn't understand you.");
              repeat3= false;
            }   
          }// End of the second reset.
          repeat2= false;
        }
        else{
          System.out.println("I don't understand you...Repeat it to me, please.");
          repeat2= false;
        }
      
      }// End First reset.
    }
  }
}
