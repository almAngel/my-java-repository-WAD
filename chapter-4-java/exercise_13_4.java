
import java.util.Scanner; // Import Scanner library.


public class exercise_13_4 {
  
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in); // Call Scanner.
    
    // User info.
    
    System.out.println ("This program sorts three different numbers introduced by keyboard.");
    System.out.println ("(Lower to higher).It also accepts negative numbers. \n");
    System.out.println ("Next, introduce the values as the console indicates: \n");
    
    System.out.println ("Please, introduce the first value: ");
    int number1 = Integer.parseInt(s.nextLine()); // Introduce number1 value.
    System.out.println ("Please, introduce the second value: ");
    int number2 = Integer.parseInt(s.nextLine()); // Introduce number2 value.
    System.out.println ("Please, introduce the third value:");
    int number3 = Integer.parseInt(s.nextLine()); // Introduce number3 value.
    
    
    // Conditions.
    
    if (number1 < number2 && number2 < number3){ 
      
      System.out.println (number1 + "," + number2 + "," + number3); //(1<2<3)
        
    }
    else if (number1 < number3 && number3 < number2){
        
      System.out.println (number1 + "," + number3 + "," + number2); //(1<3<2)
        
    }
    else if (number2 < number1 && number1 < number3){
      
      System.out.println (number2 + "," + number1 + "," + number3); //(2<1<3)
      
    }
    else if (number2 < number3 && number3 < number1) {
      
      System.out.println (number2 + "," + number3 + "," + number1); //(2<3<1)
      
    }
    else if (number3 < number1 && number1 < number2) {
      
      System.out.println (number3 + "," + number1 + "," + number2); //(3<1<2)
      
    }
    else if (number3 < number2 && number2 < number1){
      
      System.out.println (number3 + "," + number2 + "," + number1); //(3<2<1)
      
      
    }else{System.out.println ("Enter a valid value for the three numbers, please...");} // If not (ex: 0,0,0), then:
      
      
  }
  
}
