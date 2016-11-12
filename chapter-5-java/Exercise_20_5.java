
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_20_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce the height of your pyramid: ");
    int height= Integer.parseInt(s.nextLine());
    System.out.println("Introduce the character with which you want to build the pyramid: ");
    String symbol= s.nextLine();
    System.out.println("");
    int line= 1; //Pointer. Line where we're at.
    int spaces= height; //Number of spaces.
    int timesSpaces=1;
    
    while(line < height){
      
      for(int i=1;i <= spaces-1; i++){ //Print spaces in each line (= height).
        System.out.print(" ");
      }
      
      if (line==1){
        System.out.print(symbol);
      }
      
      if (line > 1){
        System.out.print(symbol);
        
        for(int j= 3; j < timesSpaces*2; j++){
          System.out.print(" ");
        }
        System.out.print(symbol);
      }
      
      spaces--;
      timesSpaces++;
      System.out.println();
      
      line++;
    }
    
    if(line== height){
      for (int k= 3; k< height*2; k++){
        System.out.print(symbol);
      
      }
      System.out.println();
    }
    
    
  }
}
