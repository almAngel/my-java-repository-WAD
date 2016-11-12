
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_26_5 {
  public static void main (String[]args){
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce un puto numero: ");
    long number= Long.parseLong(s.next());
    System.out.print("Introduce un puto digito: ");
    int digit= Integer.parseInt(s.next());
    long aux= 0;
    long flipped= 0;
    int countDigits= 0;
    int position=1;
    
    //###### FLIP THE NUMBER######
    while (number > 0){
      
      aux= number;
      
      flipped= (flipped*10)+(aux%10);
      number/=10;
      countDigits++;

    }
    //###### FLIP THE NUMBER AGAIN######
    while (flipped >0){
      //###### FILTER: EQUALS TO digit? ######
      if((flipped%10)== digit){
        System.out.print(position+" ");
      }
      flipped/=10;
      position++;
    }
    System.out.println();//Jump Line
  }
}
