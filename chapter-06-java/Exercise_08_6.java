/**
 *
 * @author Ángel López Molina
 */
public class Exercise_08_6 {
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
        matchResult= (int)(Math.random()* 6) +1;
       
        switch(matchResult){
       
          case 1:
          case 2: 
          case 3: 
            System.out.print(" 1 |");
            break;
          case 4:
          case 5:
            System.out.print(" 2 |");
            break;
          case 6: 
            System.out.print(" X |");
            break;
          default:
        }
      }
      System.out.println();
    }
  }
}
