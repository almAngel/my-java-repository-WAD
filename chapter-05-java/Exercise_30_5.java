
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_30_5 {
  public static void main (String[]args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Day1: ");
    int day1= Integer.parseInt(s.next());
    System.out.print("Hour1: ");
    int hour1= Integer.parseInt(s.next());
    System.out.println("Day2: ");
    int day2= Integer.parseInt(s.next());
    System.out.println("Hour2: ");
    int hour2= Integer.parseInt(s.next());
    
    int daysDifference= day2-day1;
    int hourDifference= 0;
    int aux= 0;
    
    if (day1 < day2){
      
      for(int i= day1; i <= day2-day1; i++){
        for(int j= 0; j <= day2*24; j+=24){
          System.out.println(j);
        } 
      }
    }
    //###### NOT RESOLVED YET ######
  }
}
