
import java.util.Scanner; //Import Scanner.

/**
 *
 * Exercise_8_5
 * 
 * 
 * @author Ángel López Molina
 */
public class exercise_8_5 {
  public static void main (String []args){
  
    Scanner s = new Scanner (System.in); //Call Scanner.
    
    boolean repeat= true;
    
      while (repeat){//While repeat condition is true, then:
       
        boolean repeat2= true;
        int number; 
        
        System.out.println("Introduce a number: ");
        number = Integer.parseInt(s.nextLine());
        System.out.println("");
        
        for (int iter=0; iter <= 10; iter++){//It iterates 10 times and miltiplies the iter state value by the number.
        
          int operation= number*iter;
          System.out.println(operation);
        }
        
        while(repeat2){//While repeat2 is true, then:
          
          System.out.println("Repeat? [Y/N]");
          String choice= s.nextLine();
          
          if(choice.equalsIgnoreCase("y")){
            repeat2= false;
          }
          else if (choice.equalsIgnoreCase("n")){
            repeat= false;
            repeat2= false;
          } 
          else{
            System.out.println("Introduce a valid answer.");
          }
        }
      }
        
  }
}  
  

