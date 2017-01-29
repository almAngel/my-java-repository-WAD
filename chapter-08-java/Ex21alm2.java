
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Ex21alm2 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] mg= new int [5];
    int numIntroducidos= mg.length;
    
    for (int i = 0; i < mg.length; i++) {
      System.out.println("Introduce un numero: ");
      mg[i]= Integer.parseInt(s.nextLine());
      numIntroducidos--;
      System.out.println("Te quedan "+ numIntroducidos + " numeros por introducir.");
      System.out.println();
    }
    
    for (int i = 1; i <= 100; i++) {
      for (int j = 0; j < mg.length; j++) {
        if(i== mg[j]){
          System.out.print(mg[j]+" ME GUSTA");
        }
      }
      System.out.print(i+" no me gusta");
      
      System.out.println();
    }
   // +" no me gusta"
  }
}
