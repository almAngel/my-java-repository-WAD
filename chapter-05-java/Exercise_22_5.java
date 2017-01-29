
import java.util.Scanner;


/**
 *
 * @author Ángel López Molina
 */


public class Exercise_22_5 {
  public static void main (String[]args){
  
    Scanner s = new Scanner (System.in);
    
    boolean isPrime= true;
    boolean repeat= true;
    
    while(repeat){
      
      boolean repeat2= false;
      
      for (int i= 100; i >=2; i--){
        for (int j= i-1; j>=2; j--){
          int check= i%j;
          if (check==0){
            isPrime= false;
            repeat= false;
          }
        
      }  
        if (isPrime){ 
          System.out.println(i);
        }
      isPrime= true;
      repeat2= true;
      }
      while(repeat2){
        System.out.println("Repeat? [Y/N]");
        String choice= s.nextLine();
        if(choice.equalsIgnoreCase("y")){
          repeat= true;
          repeat2= false;
        }
        else if (choice.equalsIgnoreCase("n")){
          repeat=false;
          repeat2= false;
        }
        else{
          repeat2=true;
        }
        
    
      }
      
    }
    
  }
 
}
