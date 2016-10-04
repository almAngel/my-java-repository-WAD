/**
*
*
*My colored class schedule.
*
*
*
*Ángel López Molina.
*
**/

public class ColoredSchedule {
  public static void main (String [] args) {
    
    // Variables. They can change along the code.
    
    String orange = "\033[33m";
    String red = "\033[31m";
    String green = "\033[32m" ;
    String blue = "\033[34m" ;
    String purple = "\033[35m" ;
    String yellow = "\033[36m";

    // Prints some colored Strings.

    System.out.println ("-------------------------------------------------");
    System.out.printf  (" %-5s %-5s %-5s %-5s %-5s %-5s \n", "Hour","MO","TU","WE","TH","FR");
    System.out.printf  (" %-5s %-5s %-5s  %-5s  %-5s   %-5s \n", "8:15",orange+"S.INF",green+"PROG",green+"PROG",blue+"B.D",purple+"L.M");
    System.out.printf  (" %-5s%-5s %-5s  %-5s  %-5s   %-5s \n", "9:15",orange+" S.INF",green+"PROG",green+"PROG",blue+"B.D",purple+"L.M");
    System.out.printf  (" %-5s %-5s %-5s  %-5s   %-5s   %-5s \n", "10:15",orange+"S.INF",green+"PROG",purple+"L.M",blue+"B.D",yellow+"E.D");
    System.out.printf  (" %-5s %-5s %-5s  %-5s  %-5s %-5s \n", "11:15","R","E","CR","E","O");
    System.out.printf  (" %-5s %-5s   %-5s   %-5s   %-5s  %-5s \n", "11:45",red+"FOL",blue+"B.D",purple+"L.M",green+"PROG",orange+"S.INF");
    System.out.printf  (" %-5s %-5s   %-5s   %-5s   %-5s  %-5s \n", "12:45",red+"FOL",blue+"B.D",yellow+"E.D",green+"PROG",orange+"S.INF");
    System.out.printf  (" %-5s %-5s   %-5s   %-5s   %-5s  %-5s \n", "13:45",red+"FOL",blue+"B.D",yellow+"E.D",green+"PROG",orange+"S.INF");
    System.out.println ("-------------------------------------------------");  

  }

}
