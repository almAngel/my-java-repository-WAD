/**
 *
 * @author Ángel López Molina
 */
public class Exercise_07_6 {
  public static void main(String[] args) {
    int columns= 3;
    int matchResult= 0; 
    
    for(int rows= 1; rows <= 15; rows++){
      System.out.printf("%4d. |",rows);
    
    
      if (rows== 15){
        columns= 1;
        System.out.print("Result: ");
      }
    
      for (int j = 1; j <= columns; j++) {
        matchResult= (int)(Math.random()* 3) +1;
       
        switch(matchResult){
       
          case 1: 
            System.out.print(" 1 |");
            break;
          case 2: 
            System.out.print(" 2 |");
            break;
          case 3: 
            System.out.print(" X |");
            break;
          default:
        }
      }
      System.out.println();
    }
  }
}
