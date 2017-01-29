
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_12_7 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int[] n= new int [10];
    int[] m= new int [10];
    
    int fin=0;
    int begn=0;
    //int max= Integer.MIN_VALUE;
    //int min= Integer.MAX_VALUE;
    boolean condition;
    
    //###### INTRODUCE NUMBERS INTO THE ARRAY ######
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce a number: ");
      n[i]= Integer.parseInt(s.nextLine());
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(n[i]+ " ");
    }
    
    //----------------------------------------------
    
    
    //###### CHECK CONDITIONS ######
    do{
      condition= true;
      
      System.out.println("Introduce the first cell you want: ");
      begn= Integer.parseInt(s.nextLine());
      if(begn < 0 || fin > 9){
        condition= false;
      }
      System.out.println("Introduce the last cell you want: ");
      fin= Integer.parseInt(s.nextLine());
      if(begn > 9 || fin < 0){
        condition= false;
      }
    
      if (begn > fin){
        condition= false;
      }
    }while(!condition);
    
    //------------------------------------------------
    
    for (int i = 0; i < 10; i++) {
      m[i]= n[i]; 
    }
    
    m[fin]= n[begn];
    for (int i = fin+1; i < 10; i++) {
      m[i]= n[i-1];
    }
    m[0]= n[9];
    
    for (int i = 0; i < begn; i++) {
      m[i+1]= n[i];
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(m[i]+ " ");
    }
    
  }
}
