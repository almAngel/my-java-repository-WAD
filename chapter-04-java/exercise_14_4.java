
import java.util.Scanner; // Import Scanner library.

public class exercise_14_4 {
  
  public static void main (String[]args) {
    
    Scanner s = new Scanner (System.in); // Call Scanner.
    
     // User info.
    
    System.out.println ("Is your number a pair number, divisible by 5 or maybe a prime number? Try it. \n");
    System.out.println ("Please, introduce your number: ");
    
    int number = Integer.parseInt(s.nextLine()); // Introduce Number.
    
    if (number%2 == 0){ // If number module 2 is equal to 0 it means it's divisible by 2.
      
      System.out.println("It's a pair number.");
    
    }else { // If not, then it's a prime number.
      
      System.out.println ("It is a prime number.");
      
    }
    
    if (number%5 == 0 || number%10 == 5 ){ // If number module 5 is equal to 0 it means it's divisble by 5.
    //And if number module 10 is equal to 5 it means the same. Two posibilities to prove the same thing.
        
      System.out.println("It's divisible by 5.");
        
    }else { 
      
      System.out.println ("It's not divisible by 5.");
      }
    
  }
  
}
