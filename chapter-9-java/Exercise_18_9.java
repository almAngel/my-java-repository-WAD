
import MisFunciones.MyFunctions;
import java.util.Scanner;


/**
 *
 * @author Ángel López Molina
 */
public class Exercise_18_9 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.print("Introduce un numero a convertir: ");
    long n= Integer.parseInt(s.nextLine());
    
    long f= MyFunctions.decimalToBinary(n);
    
    System.out.print("El numero "+ n + " es " + f + " en formato binario.");
  }
}
