
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
  System.out.println ();//Blank space.
  System.out.println ("a- Java");
  System.out.println ("b- JavaScript");
  System.out.println ("c- J++");
  
  System.out.println ();//Blank space.
  String question1 = s.nextLine();
  System.out.println ();//Blank space.
  
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
  System.out.println ();//Blank space.
  System.out.println ("a- It's a weak typed language");
  System.out.println ("b- It's a low level language");
  System.out.println ("c- It's an objects oriented language ");
  
  System.out.println ();//Blank space.
  String question2 = s.nextLine();
  System.out.println ();//Blank space.
       
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
  System.out.println ();//Blank space.
  System.out.println ("a- Sillicon, nanotransistors and aluminum");
  System.out.println ("b- Sand, nanotransistors and aluminum");
  System.out.println ("c- Sillicon, microtransistors and aluminum");
  
  System.out.println ();//Blank space.
  String question3 = s.nextLine();
  System.out.println ();//Blank space.
  
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
  System.out.println ();//Blank space.
  System.out.println ("a- Approximately each two years it multiplies the maximum amount of transistors per processor.");
  System.out.println ("b- Approximately each two years it duplicates the maximum amount of transistors per processor.");
  System.out.println ("c- Approximately each two years it quadruplicates the maximum amount of transistors per processor.");
  
  System.out.println ();//Blank space.
  String question4 = s.nextLine();
  System.out.println ();//Blank space.
      
    if (question4.equalsIgnoreCase("a")){ 
      
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
      
    }
    else if (question4.equalsIgnoreCase("b")){
   
      System.out.println ("Correct");
      score++;
      System.out.println ();//Blank space.
      System.out.println ("Score: " + score);
      System.out.println ();//Blank space.
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
  System.out.println ("HTML is: ");
  System.out.println ();//Blank space.
  System.out.println ("a- A markup language");
  System.out.println ("b- A programming language");
  System.out.println ("c- A non standardized language");
  
  System.out.println ();//Blank space.
  String question5 = s.nextLine();
  System.out.println ();//Blank space.
      
    if (question5.equalsIgnoreCase("a")){ 
      
      System.out.println ("Correct");
      score++;
      System.out.println ();//Blank space.
      System.out.println ("Score: " + score);
      System.out.println ();//Blank space.
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
    
  System.out.println ("About MARKUP LANGUAGES subject...");
  System.out.println ("XML is: ");
  System.out.println ();//Blank space.
  System.out.println ("a- A markup language derivative from SGML");
  System.out.println ("b- A markup language derivative from HTML");
  System.out.println ("c- A markup language derivative from Java");
  
  System.out.println ();//Blank space.
  String question6 = s.nextLine();
  System.out.println ();//Blank space.
      
    if (question6.equalsIgnoreCase("a")){ 
      
      System.out.println ("Correct");
      score++;
      System.out.println ();//Blank space.
      System.out.println ("Score: " + score);
      System.out.println ();//Blank space.
    }
    else if (question6.equalsIgnoreCase("b")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question6.equalsIgnoreCase("c")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
  
  //DATABASE.
  System.out.println ("About DATABASE subject...");
  System.out.println ("The Hash code formula we've seen in class is: ");
  System.out.println ();
  System.out.println ("a- K(H)= K MOD pN>M");
  System.out.println ("b- t = SQURT(2h/g)");
  System.out.println ("c- H(K)= K MOD pN>M");
  
  System.out.println ();//Blank space.
  String question7 = s.nextLine();
  System.out.println ();//Blank space.
      
    if (question7.equalsIgnoreCase("a")){ 
      
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question7.equalsIgnoreCase("b")){
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
    else if (question7.equalsIgnoreCase("c")){
   
      System.out.println ("Correct");
      score++;
      System.out.println ();//Blank space.
      System.out.println ("Score: " + score);
      System.out.println ();//Blank space.
    }
    else{
   
      System.out.println ("Not correct");
      System.out.println ("Score: " + score);
    }
   
   
   
   
   
    
  }
}
