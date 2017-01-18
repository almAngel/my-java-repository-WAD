
import MisFunciones.MyFunctions;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_16_9 {
  public static void main(String[] args) {
    
    for (int i = 99999; i > 0; i--) {
      if (MyFunctions.Capicua(i)) {
        System.out.print(i +" ");
      }
    }
  }
}
