/**
 *
 * @author Ángel López Molina
 */
public class Exercise_05_6 {
  public static void main(String[] args) {
    
    int max= 100;
    int min= 199;
    int average= 0;
    int count= 0;
    int sum= 0;
    
    for (int i = 1; i <= 50; i++) {
      int number= (int)(Math.random()*100)+100;
      System.out.print(number+" ");
      
      sum+= number;
      count++;
      
      if (number > max){ //Max
        max= number; 
      }
      else if(number < min){
        min= number;
      }
      average= sum/count;
      
    }
    
    System.out.println("\n\nMax Value: "+ max);
    System.out.println("Min Value: "+ min);
    System.out.println("Average: "+ average);
    
  }
}
