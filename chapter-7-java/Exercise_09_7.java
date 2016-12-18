
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_09_7 {
  public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);
    int[] myArray= new int[8];
    
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("Enter a number: ");
      myArray[i]= Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    
    for (int j = 0; j < 8; j++) {
      if(myArray[j]%2 == 0){
        System.out.println(myArray[j]+ " par");
      }
      else{
        System.out.println(myArray[j]+ " impar");
      }
    }
  } 
}
