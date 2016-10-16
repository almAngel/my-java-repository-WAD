
import java.util.Scanner;


/**
 * 
 * 
 * Write a program that works like a small test, adding scores and printing the
 * total score.
 * 
 * 
 * @author Ángel López Molina
 */



public class exercise_12_4 {
  
  public static void main (String[]args){
  
  Scanner s = new Scanner (System.in);
 
  int score = 0;
  int exercise = 0;
 
  //PROGRAMMING.
  System.out.println ("About PROGRAMMING subject...");
  System.out.println ("Which programming language do we study in class?");
  System.out.println ();
  System.out.println ("a- Java");
  System.out.println ("b- JavaScript");
  System.out.println ("c- J++");
  
  System.out.println ();//IT'S JUST A SPACE.
  String question1 = s.nextLine();
  System.out.println ();//IT'S JUST A SPACE.
  
    if (question1.equalsIgnoreCase("a")){ 
      
      System.out.println ("Correct");
      score++;
      System.out.println ();
      System.out.println ("Score: " + score);
      System.out.println ();
    }
    else if (question1.equalsIgnoreCase("b")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question1.equalsIgnoreCase("c")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    
  
  System.out.println ("About PROGRAMMING subject...");
  System.out.println ("About the programming language that we use in this subject:");
  System.out.println ();
  System.out.println ("a- It's a weak typed language");
  System.out.println ("b- It's a low level language");
  System.out.println ("c- It's an objects oriented language ");
  
  System.out.println ();//IT'S JUST A SPACE.
  String question2 = s.nextLine();
  System.out.println ();//IT'S JUST A SPACE.
       
    if (question2.equalsIgnoreCase("a")){ 
      
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
      
    }
    else if (question2.equalsIgnoreCase("b")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question2.equalsIgnoreCase("c")){
   
      System.out.println ("Correct");
      score++;
      System.out.println ();
      System.out.println ("Score: " + score);
      System.out.println ();
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
  
    
  //COMPUTER SCIENCE.
  System.out.println ("About COMPUTER SCIENCE subject...");
  System.out.println ("A Processor core is made of: ");
  System.out.println ();
  System.out.println ("a- Sillicon, nanotransistors and aluminum");
  System.out.println ("b- Sand, nanotransistors and aluminum");
  System.out.println ("c- Sillicon, microtransistors and aluminum");
  
  System.out.println ();//IT'S JUST A SPACE.
  String question3 = s.nextLine();
  System.out.println ();//IT'S JUST A SPACE.
  
    if (question3.equalsIgnoreCase("a")){ 
      
      System.out.println ("Correct");
      score++;
      System.out.println ();
      System.out.println ("Score: " + score);
      System.out.println ();
    }
    else if (question3.equalsIgnoreCase("b")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question3.equalsIgnoreCase("c")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
   
  System.out.println ("About COMPUTER SCIENCE subject...");
  System.out.println ("Moore's law says that: ");
  System.out.println ();
  System.out.println ("a- Approximately each two years it multiplies the maximum amount of transistors per processor.");
  System.out.println ("b- Approximately each two years it duplicates the maximum amount of transistors per processor.");
  System.out.println ("c- Approximately each two years it quadruplicates the maximum amount of transistors per processor.");
  
  System.out.println (); //IT'S JUST A SPACE.
  String question4 = s.nextLine();
  System.out.println ();//IT'S JUST A SPACE.
      
    if (question4.equalsIgnoreCase("a")){ 
      
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
      
    }
    else if (question4.equalsIgnoreCase("b")){
   
      System.out.println ("Correct");
      score++;
      System.out.println ();//IT'S JUST A SPACE.
      System.out.println ("Score: " + score);
      System.out.println ();//IT'S JUST A SPACE.
    }
    else if (question4.equalsIgnoreCase("c")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    
  //MARKUP LANGUAGES.
  System.out.println ("About MARKUP LANGUAGES subject...");
  System.out.println ("A Processor core is made of: ");
  System.out.println ();
  System.out.println ("a- Sillicon, nanotransistors and aluminum");
  System.out.println ("b- Sand, nanotransistors and aluminum");
  System.out.println ("c- Sillicon, microtransistors and aluminum");
  
  System.out.println ();//IT'S JUST A SPACE.
  String question5 = s.nextLine();
  System.out.println ();//IT'S JUST A SPACE.
      
    if (question5.equalsIgnoreCase("a")){ 
      
      System.out.println ("Correct");
      score++;
      System.out.println ();//IT'S JUST A SPACE.
      System.out.println ("Score: " + score);
      System.out.println ();//IT'S JUST A SPACE.
    }
    else if (question5.equalsIgnoreCase("b")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question5.equalsIgnoreCase("c")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    
    
  }
}
