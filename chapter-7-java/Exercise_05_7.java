
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_05_7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    int[] myArray= new int[10];
    int number=0;
    int min= Integer.MAX_VALUE;
    int max= Integer.MIN_VALUE;
    
    for (int i = 0; i < myArray.length; i++) {
      System.out.println("Introduce a number: ");
      myArray[i]= Integer.parseInt(s.nextLine());
     
      if(myArray[i]< min){
        min= myArray[i];
      }
      else if(myArray[i]> max){
        max= myArray[i];
      } 
      System.out.println();
    }
    
    for (int j = 0; j < 10; j++) {
      if(myArray[j]== min){
        System.out.println(myArray[j]+" Minimo");
      }
      else if(myArray[j]== max){
        System.out.println(myArray[j]+" Maximo");
      }
      else{
        System.out.println(myArray[j]);
      }
    }
    
  }
}
