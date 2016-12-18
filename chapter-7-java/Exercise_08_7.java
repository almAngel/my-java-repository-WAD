
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_08_7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int temperature= 0;
    int[] myArray1= new int[12];
    int height= 12;
    
    for (int i = 0; i < myArray1.length; i++) {
      System.out.println("Enter a number: ");
      myArray1[i]= Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    for (int j = 0; j < height; j++) { //Repeat and jump line.
      System.out.print((j+1)+". ");
       for (int l = 0; l < myArray1[j]; l++) { //Print
         System.out.print("█");
        }
      System.out.println();
    }
  }
}
