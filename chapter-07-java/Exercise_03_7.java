
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_03_7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    int [] myArray= new int[10];
    int [] myArray2= new int[10];
    int number= 0;
    
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("Introduce a number: ");
      number= Integer.parseInt(s.nextLine());
      myArray[i]= number;
      myArray2[(myArray.length - 1) - i]= myArray[i];
    }
    
    for (int j = 0; j < 10; j++) {
      System.out.print("\n"+myArray2[j]+ " ");
    }
    
  }
}
