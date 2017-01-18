
import MisFunciones.MyFunctions;


/**
 *
 * @author Ángel López Molina
 */
public class Exercise_15_9 {
  public static void main(String[] args) {
    for (int i = 1000; i > 1; i--) {
      if(MyFunctions.Prime(i)) System.out.print(i +" ");;
    }
  }
}
