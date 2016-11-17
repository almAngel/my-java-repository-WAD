

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_1_6 {
  public static void main(String[] args) {
    
    int sum= 0;
    
    for (int i = 1; i <= 3; i++) {
      int randomNum= (int)(Math.random()*6)+1;
      System.out.println("Dice "+i+" result: "+randomNum);
      sum+= randomNum;
    }
    System.out.println("Sum: "+sum);
    
  }
}
