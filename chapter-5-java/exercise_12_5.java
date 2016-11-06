
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class exercise_12_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner(System.in);
    
    System.out.println ("Fibonacci succession.(0,1,1,2...) Introduce how many numbers you want to show: ");
    double number= Integer.parseInt(s.nextLine());
    System.out.println("\n");
    double start=0,t1=0,t2=1;
    
    if(number==0){
      System.out.println("Introduce a valid number."); 
    }
    else if(number==1){
      System.out.println("0");
    }
    else if(number==2){
      System.out.println("0");
      System.out.println("1");
    }else if (number>2){
      System.out.println("0");
      for(int i=2; i <= number;i++){
        t1=t2;
        t2=start;
        start= t1+t2;
        System.out.println ((int)start);
      }
    }
  }
}
