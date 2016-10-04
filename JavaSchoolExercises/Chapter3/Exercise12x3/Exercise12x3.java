/**
*
*
* Exercise12x3.
*
* Make a program which calculates the second exam's desired score of your 
* Programming school subject, based on the first exam's score and the average 
* score knowing that the first exam's score value is 40% and the second one is 60%. 
* 
* @author Ángel López Molina.
*
*
**/

import java.util.Scanner; // Import Scanner library.

public class Exercise12x3 {
  public static void main (String[]args) {
    
    Scanner s = new Scanner (System.in); // Calling Scanner.
    
    // Vars. 
    
    float score1;
    float score2;
    float scoreYouWant;
    
    //-------------------------------------------
    
    System.out.println ("Estimation of score you need to have for the desired final average... ");
    System.out.println ("Enter your first score: ");
    
    score1 = Float.parseFloat (s.nextLine()); // First exam score.
    
    System.out.println ("Enter the desired final score:");

    scoreYouWant = Float.parseFloat (s.nextLine()); // Desired score.

    System.out.println ("Thinking... ");

    score2 = (scoreYouWant - (score1 * 0.4f))/0.6f; // Average score.
    
    System.out.printf ("Result %.2f %s \n", score2, "That's what you need to score. "); // Result.
    
    }
  
  
  }
