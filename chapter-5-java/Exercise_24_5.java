
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_24_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    //##### REQUESTING VALUES #####
    System.out.println("Introduce the height of the pyramid: ");
    int height= Integer.parseInt(s.nextLine());
    
    int blankSpaces= height-1;//The pointer starts in the first line.
    int digitsPerLine= 1;//Number of digits per line.
    int line= 1;
    int number=1;
            
    while (line <= height){ //It repeats something till it's = height.
      
      //##### PRINT BLANKSPACES #####
      for (int i= 1; i<= blankSpaces; i++){
        System.out.print(" ");
      }
      //##### PRINT THE UPPER VERTEX #####
      if (line==1){ 
        System.out.print(number);

      }
      
      if (line> 1){// If the "pointer" is above the first line:
        
        //##### PRINT THE LEFT SIDE #####
        for(int j= 1; j< digitsPerLine; j++){ //It increases the value of the number which is in the middle arista.
          
          System.out.print (j);
        }
        //##### PRINT THE RIGHT SIDE #####
        for(int k= digitsPerLine; k>0;k--){ //It decreases the value of the number which is in the middle arista.
          
          System.out.print (k);
        }
        
      }
      
      digitsPerLine++;
      blankSpaces--;
      System.out.println();
      line++;
      
    }
    
  }
}
