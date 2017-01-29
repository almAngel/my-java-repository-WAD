
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_07_7 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int [] myArray= new int [100];
    int aux= 0;
    int aux2= 0;
    
    for (int i = 0; i < myArray.length; i++) {
      myArray[i]= (int)(Math.random()*21);
      System.out.print(myArray[i]+ " ");
    }
    System.out.println("\n\nIntroduce the number you want to switch: ");
    aux= Integer.parseInt(s.nextLine());
    System.out.println("Introduce the number which will replace it: ");
    aux2= Integer.parseInt(s.nextLine());
    
    for (int j = 0; j < myArray.length; j++) {
      if (aux== myArray[j]){
        myArray[j]= aux2;
        System.out.print("'"+ myArray[j]+"' ");
      }
      else{
        System.out.print(myArray[j]+ " ");
      }
    }
    
  }
}
