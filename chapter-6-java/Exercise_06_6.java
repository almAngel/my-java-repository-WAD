
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_06_6 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int compNumber= (int)(Math.random()*100);
    int totalAttemps= 5;
    String switchAnswer= "";
    boolean repeat= true;
    
    System.out.println("I've thought a random number between 0 and 100");
    
    do{
      System.out.print("Try to guess the number :D : ");
      int introducedNumber= Integer.parseInt(s.nextLine());
      totalAttemps--;
      
      if (introducedNumber == compNumber){ // Check if the numbers are the same.
        System.out.println("Congratulations! You guessed it!");
        System.out.println("The number was "+ compNumber);
        repeat= false;
      }else{
        if(introducedNumber < compNumber){
          switchAnswer= "higher ";
        }
        else{
          switchAnswer= "lower ";
        }
        System.out.println("Incorrect. One hint, the number I thought is " + switchAnswer + "than yours.");
        System.out.println("Attemps remaining: " + totalAttemps);
      }
    }while (totalAttemps > 0 && repeat);
    System.out.println("Oh, sorry. The number was: "+ compNumber);
  }
}
