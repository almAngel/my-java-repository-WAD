
/**
 *
 * @author Ángel López Molina
 */
public class Exercise_09_6 {
  public static void main(String[] args) {
    int randNum= 0;
    int times= 0;
    
    System.out.println("The program shows numbers from 0 to 100 while the number showed is not 24.");
    System.out.println("The program doesn't count the '24 number time'. \n");
    
    while(randNum != 24) {
      randNum= (int)(Math.random()*100);
      System.out.print(randNum+ " ");
      times++;
    }
    System.out.print("(END)");
    System.out.println("\n Numbers showed: "+ (times -1));
    
  }
}
