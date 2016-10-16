/**
*
* Write a program that guess your horoscope depending of your birth day
* and month.
*
*
* @author Ángel López Molina
*
*
*/

import java.util.Scanner;

public class exercise_10_4 {
  
  public static Scanner s = new Scanner (System.in);
  
  public static void main (String []args ){
    
    System.out.println ("Know your Zodiac sign...");
  
    System.out.println ("Introduce your birth month (ex: January): ");
    String month = s.nextLine();
    
    System.out.println ("Introduce your birth day: ");
    int day = Integer.parseInt (s.nextLine());
    
    switch (month){
      
      case ("January"): // January.
      
      if (day >= 22 && day <= 31){ System.out.println ("You are Aquarius");}
      
      else {System.out.println ("You are Capricorn");}
      
      break;
      
      //-----------------------------------
    
      case ("February"): // February.
      
      if (day >= 19 && day <= 29){ System.out.println ("You are Piscis");}
      
      else{ System.out.println ("You are Aquarius");}
    
      break;
      
      //-----------------------------------
      
      case ("March"): //March.
      
      if (day >= 21 && day <= 31){System.out.println ("You are Aries");}
      
      else {System.out.println ("You are Piscis");}
      
      break;
      
      case ("April"): //April
      
      if (day >= && day )
    }
  }
}
