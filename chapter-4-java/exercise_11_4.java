import java.util.Scanner; // Import Scanner.

/**
 * 
 * Write a program that, giving it an hour and minutes, it should say 
 * the time (in seconds) missing for midnight.
 * 
 * For who is reading this code, the "/ºNº/" and the " /º-Nº/" things
 * are like "labels" in markup languages. Its just a way to specify 
 * condition areas, easily to distinguish.
 * 
 * Also, (and it's important to say), the code is bigger than the original
 * should be, because I know when the user is uncomfortable. 
 * It's not the same to say: Time missing = 89234 seconds that saying:
 * Time missing = 15:45 h, so I decided to put both formats.
 * 
 * 
 * @author Ángel López Molina
 */


public class exercise_11_4 {
  
  public static void main (String[]args){
  
  Scanner s = new Scanner (System.in); // Call the Scanner.
  
  // User info.
  
  System.out.println("You want to know the exact seconds it miss for midnight?");
  
  // Init. vars.
  System.out.println ("Introduce an hour value: ");
  int hour = Integer.parseInt(s.nextLine());
  
  System.out.println ("Introduce a minute value: ");
  int minute = Integer.parseInt(s.nextLine());
 
 
  // Here starts the condition chain.
 
/*1*/ if (hour <= 24 && hour > 0 && minute < 60 && minute >0){
    
        int hoursToSeconds = hour * 3600; // Converting introduced hours to seconds.
        int minsToSeconds = minute * 60; // Converting introduced mins to seconds.
  
        int hoursAndMinsSum = hoursToSeconds + minsToSeconds; // When mins and hours are in seconds format, we sum both values.
  
/*2*/     if (hoursAndMinsSum < 86400) { // If the sum (hours + mins), already converted to seconds is minor than 86400 (24h in seconds), then it keeps running.
  
            int totalTimeInSecsDifference = 86400 - hoursAndMinsSum;  // To know the time difference, we need to suubtract both values (24h in seconds less introduced time).
    
            System.out.println("Time missing in seconds: " + totalTimeInSecsDifference + " secs."); // Print values (Result in seconds).
    
          }else{ // If not, its because hour is equal to 24h ( x = 24h ).
          
            System.out.println("It's Midnight");
          
/*-2*/     }
            
          

      
        int hoursInSecondsToMins = hoursToSeconds/60; // Hours , converted to seconds before, back to mins.
        int minsInSecondsToMins = minsToSeconds/60; // Mins , before in seconds, converted to mins.
   
/*3*/     if (hoursInSecondsToMins < 1440) { // If hours (converted from seconds to minutes) is less than 24h (1440 mins), then:
  
            int hoursDifference = 1440 - hoursInSecondsToMins; // The difference between midnight hour (24h in minutes) less introduced hour (comparing in minutes). 
            int hoursDifferenceInMinsToHours = hoursDifference/60; // The minutes, before in seconds, back to minutes format.
      
/*4*/         if (minsInSecondsToMins <= 59){ // If minutes are equal or less than 60, then:
      
                int minsDifference = 60 - minsInSecondsToMins; // Calcualating minutes missing.
     
                System.out.println ("Time missing in XX:XX format: " + hoursDifferenceInMinsToHours + "h" + ":" + minsDifference + "m" );
          
/*-4*/        }else {System.out.println("Introduce a valid minute value, please...");} // If not a valid minutes value, then:
     
/*-3*/    }
    

      }else {
        
        System.out.println("Introduce valid values, please. The values should be positive");
        System.out.println("and logical. Don't forget which is our time format.");
        
/*-1*/ } // If not is because in the begining the user introduced a wrong hour value.
  
  }

}
