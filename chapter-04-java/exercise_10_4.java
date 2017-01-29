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
        else if (day < 19 && day > 0){System.out.println ("You are Capricorn");}
        
        else {System.out.println ("Please, introduce a valid number. January has 31 days max.");}
      
        break;
      
      //-----------------------------------
    
      case ("February"): // February.
      
        if (day >= 19 && day <= 29){ System.out.println ("You are Piscis");}
        else if (day < 19 && day > 0){System.out.println ("You are Aquarius");}
        
        else {System.out.println ("Please, introduce a valid number. February has 29 days max if its leap-year,if not, it has 28 days max.");}
        
        break;
      
      //-----------------------------------
      
      case ("March"): //March.
      
        if (day >= 21 && day <= 31){System.out.println ("You are Aries");}
        else if (day < 21 && day > 0) {System.out.println ("You are Piscis");}
        
        else {System.out.println ("Please, introduce a valid number. March has 31 days max.");}
      
        break;
      
      //-----------------------------------
      
      case ("April"): //April.
      
        if (day >= 20 && day <= 30){System.out.println ("You are Taurus");}
        else if (day < 20 && day > 0){System.out.println ("You are Aries");}
        
        else {System.out.println ("Please, introduce a valid number. April has 30 days max.");}
        
        break;
        
      //-----------------------------------
      
      case ("May"): //May.
      
        if (day >= 21 && day <= 31){System.out.println ("You are Gemini");}
        else if (day < 21 && day > 0){System.out.println ("You are Taurus");}
        else {System.out.println ("Please, introduce a valid number. May has 31 days max.");}
        
        
        
        break;
        
      //-----------------------------------
      
      case ("June"): //June.
        
        if (day >= 21 && day <= 30){System.out.println ("You are Cancer");}
        else if (day < 21 && day > 0){System.out.println ("You are Gemini");}
        
        else {System.out.println ("Please, introduce a valid number. June has 30 days max.");} 
      
        break;
        
      //-----------------------------------
      
      case ("July"): //July.
      
        if (day >= 23 && day <= 31){System.out.println ("You are Leo");}
        else if (day < 23 && day > 0){System.out.println ("You are Cancer");}
        
        else {System.out.println ("Please, introduce a valid number. July has 31 days max.");}
        
        break;
        
      //-----------------------------------
        
      case ("August"): //August.
      
        if (day >= 23 && day <= 31){System.out.println ("You are Virgo");}
        else if (day < 23 && day > 0){System.out.println ("You are Leo");}
        
        else {System.out.println ("Please, introduce a valid number. August has 31 days max.");}
        
        break;
        
      //-----------------------------------
        
      case ("September"): //September.
      
        if (day >= 23 && day <= 30){System.out.println ("You are Libra");}
        else if (day < 23 && day > 0){System.out.println ("You are Virgo");}
        
        else {System.out.println ("Please, introduce a valid number. September has 30 days max.");}
        
        break;
        
      //-----------------------------------
        
      case ("October"): //October.
      
        if (day >= 23 && day <= 31){System.out.println ("You are Scorpio");}
        else if (day < 23 && day > 0){System.out.println ("You are Libra");}
        
        else {System.out.println ("Please, introduce a valid number. October has 31 days max.");}
        
        break;
        
      //-----------------------------------
        
      case ("November"): //November.
      
        if (day >= 22 && day <= 30){System.out.println ("You are Sagittarius");}
        else if (day < 22 && day > 0){System.out.println ("You are Scorpio");}
        
        else {System.out.println ("Please, introduce a valid number. November has 30 days max.");}
        
        break;
        
      //-----------------------------------
        
      case ("December"): // December.
      
        if (day >= 22 && day <= 31){System.out.println ("You are Capricorn");}
        else if (day < 22 && day > 0){System.out.println ("You are Sagittarius");}
        
        else {System.out.println ("Please, introduce a valid number. December has 31 days max.");}
        
        break;
        
      //-----------------------------------
      
      default: 
      
        System.out.println ("Sorry, something went bad. Introduce a valid month, please.");
      
        break;
    }
  }
}
