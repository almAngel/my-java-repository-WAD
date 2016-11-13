
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_32_5 {
  public static void main (String[]args){
    Scanner s = new Scanner (System.in);
  
    System.out.print("Introduce the number from you want to extract its pair numbers: ");
    long number= Long.parseLong(s.next());
    
    //###### VARS ######
    long aux= 0;
    long flipped= 0;
    long length= 0;
    int pairsSum= 0;
    int digit= 0;
    
    //###### FLIP THE NUMBER ######
    while(number > 0){
      aux= number;
    
      flipped= (flipped*10)+(aux%10);
      number/= 10;
      length++;
    }

    for(int i =1;i<= length; i++){
      //What is a digit?:
      digit= (int)flipped%10; 
    
      //###### CHECK IF THE DIGITS ARE A PAIR NUMBER ######
      if(digit%2 == 0){
        System.out.print(digit+ " ");
        pairsSum+=digit;
      }
      flipped/=10;
    }
    System.out.println("Pairs Sum: "+ pairsSum);
  }
}
