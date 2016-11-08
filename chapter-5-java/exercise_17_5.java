
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class exercise_17_5 {
  public static void main (String[]args){
    //To do: Make reset system and symbol check.
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please, introduce a number: ");
    int number= Integer.parseInt(s.nextLine());
    
            
    for (int i= number;i<=100+number;i++){
      System.out.println(i);
      if (i== (100+number)){
        System.out.println("This is the last number: "+ i);
      }
    }
  }
}
