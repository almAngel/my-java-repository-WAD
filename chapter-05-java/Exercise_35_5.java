
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_35_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce a value for the height: ");
    int height= Integer.parseInt(s.next());
    System.out.println();
    
    int outSpaces= 0;
    int innerSpaces= height-1;
    int line= 1;
    int line2= 1;
    
    if (height < 3 || height/2==0){
      System.out.println("ERROR. Introduce an odd number.");
    }
    
    while(line <= height/2){
    
      for(int i= 1; i <= outSpaces; i++){
        System.out.print(" ");
      }
   
      System.out.print("*");
      for (int j = 1; j < innerSpaces; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      System.out.println();
      line++;
      innerSpaces-=2;
      outSpaces++;
      
    }
    if(line > height/2){
      outSpaces= height/2;
      for (int k = 1; k <= outSpaces; k++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
      
    outSpaces= height/2;
    innerSpaces= 1;
      
    while(line2 <= height/2){
      
      for (int l = 1; l < outSpaces;  l++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int m = 1; m <= innerSpaces; m++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      //innerSpaces+=2;
      line2++;
      outSpaces--;
      innerSpaces+=2;
      System.out.println();
    }
    System.out.println();
  }
}
