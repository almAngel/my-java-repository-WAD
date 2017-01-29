
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_31_5 {
  public static void main (String[]args){
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce a height: ");
    int height= Integer.parseInt(s.next());
    System.out.println();
    
    int base= (height/2)+1;
    int line= 1;
    
    //###### PRINT VERTICAL LINE ######
    while (line <= height-1){
    
      for(int i= 1; i <= height-1; i++){
        System.out.println("*");
        line++;
      }//for
     
    }//while
    
    //###### PRINT HORIZONTAL LINE ######
    for(int j= 1; j <= base; j++){
      System.out.print("* ");
    }//for
     System.out.println();
  }
}
