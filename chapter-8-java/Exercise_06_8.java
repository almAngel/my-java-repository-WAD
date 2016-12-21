/**
 *
 * @author Ángel López Molina
 */
public class Exercise_06_8 {
  public static void main(String[] args) {
    
    int row= 6;
    int column= 10;
    int max= -1;
    int min= 1001;
    
    int[][] num = new int[row][column];
    
    boolean reapeated= true;
    
    //#####################################################
    
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < column; j++) {
        do {
          num[i][j] = (int)(Math.random() * 1001);
          
          reapeated = false;
          for (int k = 0; k < 10 * i + j; k++) {
            if (num[i][j] == num[k / 10][k % 10]) {
              reapeated = true;
            }
          }
        } while (reapeated);
      }
    }
    
    //#####################################################
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        
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