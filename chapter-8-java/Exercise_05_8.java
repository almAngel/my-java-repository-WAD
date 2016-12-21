/**
 *
 * @author Ángel López Molina
 */
public class Exercise_05_8 {
  public static void main(String[] args) {
    
    int row= 6, column= 10;
            
    int num[][]= new int [row][column];
    
    int max= -1;
    int min= 1001;
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        num[i][j]= (int)(Math.random()*1001);
        
        if(num[i][j] > max){
          max= num[i][j];
        }
        else if(num[i][j] < min){
          min= num[i][j];
        }
      }
    }
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        
        if(num[i][j] == min){
          System.out.printf("%s %1d %s","'",min,"' ");
        }
        else if(num[i][j] == max){
          System.out.printf("%s %1d %s","*",max,"* ");
        }
        else{
          System.out.printf("%3d %s",num[i][j]," ");
        }
        
      }
    }
  }
}
