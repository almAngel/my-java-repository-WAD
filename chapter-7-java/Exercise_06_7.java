
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_06_7 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int[] myArray= new int[15];
    
    for (int i = 0; i < myArray.length ; i++) {
      System.out.println("Insert a number: ");
      myArray[i]= Integer.parseInt(s.nextLine());
    }
    System.out.println();
    for (int j = 0; j < myArray.length; j++) {
      System.out.print(myArray[j]+" "); 
    }
    
    int aux = myArray[14];
    for (int k = 14; k > 0; k--) {
      myArray[k] = myArray[k-1];
    }
    myArray[0] = aux;
    
    System.out.println("");
    for (int k = 0; k < myArray.length; k++) {
      System.out.print(myArray[k]+" "); 
    }
    
    
  }
}
