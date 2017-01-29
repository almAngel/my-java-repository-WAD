
import java.util.Scanner; // Import Scanner lib.


public class exercise_15_4 {
  
  public static void main (String[]args) {
    
    Scanner s = new Scanner (System.in); // Call Scanner.
    
    // User info.
    
    System.out.println ("Draw a pyramid: choose the direction which will point the edge. \n");
    System.out.println ("1. Pointing up");
    System.out.println ("2. Pointing right");
    System.out.println ("3. Pointing down");
    System.out.println ("4. Pointing left");
    
    int option = Integer.parseInt(s.nextLine()); // Insert option.
    
    String character = s.nextLine(); // Insert character.
    
    System.out.println (""); // Blank.
    
    
    // Conditionals.
    
    switch (option){
      
      case 1:
      
        /*
        System.out.printf ("        %s        \n",character);
        System.out.printf ("      %s%s%s      \n",character,character,character);
        System.out.printf ("    %s%s%s%s%s    \n",character,character,character,character,character);
        System.out.printf ("  %s%s%s%s%s%s%s  \n",character,character,character,character,character,character,character);
        System.out.printf ("%s%s%s%s%s%s%s%s%s\n",character,character,character,character,character,character,character,character,character);
        */
        
        System.out.println("        " + character + " ");
        System.out.println("      " + character + " " + character + " " + character + " ");
        System.out.println("     " + character + " " + character + " " + character + " " + character + " ");
        System.out.println("    " + character + " " + character + " " + character + " " + character + " " + character + " ");
        System.out.println("  " + character + " " + character + " " + character + " " + character + " " + character + " " + character + " " + character + " ");
        break;
      
      case 2:
      
        System.out.println(character + " ");
        System.out.println(character + " " + character);
        System.out.println(character + " " + character + " " + character);
        System.out.println(character + " " + character + " " + character + " " + character);
        System.out.println(character + " " + character + " " + character);
        System.out.println(character + " " + character);
        System.out.println(character + " ");
        break;
        
      case 3:
        
        System.out.println("  " + character + " " + character + " " + character + " " + character + " " + character + " " + character + " " + character + " ");
        System.out.println("    " + character + " " + character + " " + character + " " + character + " " + character + " ");
        System.out.println("     " + character + " " + character + " " + character + " " + character + " ");
        System.out.println("      " + character + " " + character + " " + character + " ");
        System.out.println("        " + character + " ");
        break;
        
      case 4:
      
        System.out.println("      " + character);
        System.out.println("    " + character + " " + character);
        System.out.println("  " + character + " " + character + " " + character );
        System.out.println(character + " " + character + " " + character + " " + character);
        System.out.println("  " + character + " " + character + " " + character );
        System.out.println("    " + character + " " + character);
        System.out.println("      " + character);
        break;
      
      default:
      
        System.out.println ("Something went bad, introduce a valid index number.");
      
        break;
        
    }
    
  }
  
}
