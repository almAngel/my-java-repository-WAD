/**
 *
 * @author Ángel López Molina
 */
public class Exercise_12_6 {
  public static void main(String[] args) throws InterruptedException {
    int line = 0;
    
    for(int i = 0; i < 8000; i++) {
      System.out.print("\033[32m"); // Green color.
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      
      if (line++ == 60) {
        line = 0;
        Thread.sleep(50);
        System.out.println();
      }
    }
    System.out.println();
  } 
}

