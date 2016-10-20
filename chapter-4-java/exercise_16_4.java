
import java.util.Scanner;

public class exercise_16_4 {
  
  public static void main (String[]args){
    
    Scanner s = new Scanner(System.in);
    
    int points = 0;
    
    System.out.println ("Is your couple cheating you?");
    System.out.println ("You can check it with this program!!!");
    System.out.println ("0% subjectivity!!!!! It WORKS 100%!!! \n");
    
    System.out.println ("1.Does your couple seem to be more restless than normally, without an apparent reason? [Y/N]");
    
    String answer = s.nextLine();
      if (answer.equalsIgnoreCase ("y")){
      
        points +=1;

      }
      else if (answer.equalsIgnoreCase ("n")){System.out.println("Interesting...");}
      else{System.out.println ("That makes no sense.");}
    
    System.out.println ("2.Does your couple spend more money in clothes? [Y/N]");
    
    String answer2 = s.nextLine();
      if (answer2.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer2.equalsIgnoreCase ("n")){System.out.println("Oh!...I see.");}
       else{System.out.println ("That makes no sense.");}
    
    System.out.println ("3.Did your couple lose the interest in you? [Y/N]");
    
    String answer3 = s.nextLine();
      if (answer3.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer3.equalsIgnoreCase ("n")){System.out.println("Interesting...keep going.");}
       else{System.out.println ("That makes no sense.");}
     
    System.out.println ("4.Does your couple shave, clean themselves, or fix him/her hair more frequently?");
    
    String answer4 = s.nextLine();
      if (answer4.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer4.equalsIgnoreCase ("n")){System.out.println("Hmm...");}
       else{System.out.println ("That makes no sense.");}
       
    System.out.println ("5.Does your couple allow you to see their mobile phone's diary? [Y/N]");
    
    String answer5 = s.nextLine();
      if (answer5.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer5.equalsIgnoreCase ("n")){System.out.println("Ok, that's fine.");}
       else{System.out.println ("That makes no sense.");}
       
    System.out.println ("6.Does your couple sometimes have phone calls that him/her doesn't want to answer? [Y/N]");
    
    String answer6 = s.nextLine();
      if (answer6.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer6.equalsIgnoreCase ("n")){System.out.println("Hmm...");}
       else{System.out.println ("That makes no sense.");}
       
    System.out.println ("7.Does your couple worry more to be more healthy or tanned recently? [Y/N]");
    
    String answer7 = s.nextLine();
      if (answer7.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer7.equalsIgnoreCase ("n")){System.out.println("Ok...maybe...");}
       else{System.out.println ("That makes no sense.");}
       
    System.out.println ("8.Does your couple come late after work because he/she 'have a lot of work to do'? [Y/N]");
    
    String answer8 = s.nextLine();
      if (answer8.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer8.equalsIgnoreCase ("n")){System.out.println("Oh, ok. We are close to the end");}
       else{System.out.println ("That makes no sense.");}
       
    System.out.println ("9.Did you noticed recenly he/she perfumes a lot more? [Y/N]");
    
    String answer9 = s.nextLine();
      if (answer9.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer9.equalsIgnoreCase ("n")){System.out.println("One more.");}
       else{System.out.println ("That makes no sense.");}
       
    System.out.println ("10.Does your couple confuses him/herself and says they've been with you in places he/she didn't visit with you? [Y/N]");
    
    String answer10 = s.nextLine();
      if (answer10.equalsIgnoreCase ("y")){
      
        points +=1;

      }else if (answer10.equalsIgnoreCase ("n")){System.out.println("This was the last one.");}
       else{System.out.println ("That makes no sense.");}
    
      System.out.println(""); //Blank.

      System.out.println("Result: \n");
      if (points <= 3 && points > 0 ){System.out.println ("It's not very sure, but you can check it if you don't want surprises. [30%]");}
      else if (points <= 5 && points > 3){System.out.println ("50/50 posibilities. You need to check it. [50%]");}
      else if (points > 5 && points <= 7){System.out.println ("It's so strange, you need to take it serious. [70%]");}
      else if (points > 7 && points <= 9){System.out.println ("Oh...You know what? You need to start to think about your relationship. [90%]");}
      else if (points == 10){System.out.println ("Hey you! Forget him/her, don't be silly! [100%]");}
      else {System.out.println ("Something wen't bad, sorry. You need to start it again.");}
      
  }
  
}
