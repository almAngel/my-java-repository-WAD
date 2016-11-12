
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_19_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce the height of your pyramid: ");
    int height= Integer.parseInt(s.nextLine());
    System.out.println("Introduce the character with which you want to build the pyramid: ");
    String symbol= s.nextLine();
    System.out.println("");
    // Times it will print a blank space
    int timesSpaces= height*2;
    
    // Times it will print a symbol.
    int timesSymbol= 1;
    //----------------------------------
    
    for(int jump= 0; jump < height; jump++){
      
      for(int j=0; j < timesSpaces; j++){

        System.out.print(" ");
        
      }
      
      for (int k= 1; k < timesSymbol*2; k++){
      
        System.out.print((symbol));

      }
      timesSpaces--;
      timesSymbol++;
      System.out.println();
    }
    System.out.println();
  }
}
