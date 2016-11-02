
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
    
    int step= 0;
    
    if (step==0){
      System.out.println("Introduce a number: ");
      int number = Integer.parseInt(s.nextLine());
      System.out.println("");
      int iter= 0;
      
      for (iter= 0; iter <= 10; iter++){
 
          int operation= number*iter;
          System.out.println(operation);

          if (iter == 10){
            step++;
            System.out.println("step: "+step);
          }
      }
      
      iter-=11;
      System.out.println("iter:"+iter);
    }
    if (step ==1){
    
        System.out.println ("END\n");  
        System.out.println ("Repeat? [Y/N]\n");
        String choice = s.nextLine();
    
        if (choice.equalsIgnoreCase("y")){    
          step-=1;
          System.out.println("step:"+step);
        }
        else if (choice.equalsIgnoreCase("n")){
          step+=1;
          System.out.println("Execution finished succesfully.");
          System.out.println("step:"+step);
        }
          
      }
    
      
  }
    
    
}    

