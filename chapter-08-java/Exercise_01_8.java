/**
 *
 * @author Ángel López Molina
 */
public class Exercise_01_8 {
  public static void main(String[] args) {
    
    int num[][]= new int[3][6];
    int row= 3, column= 6;
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        num[i][j]= -1;
      }
    }
    
    num[0][0]= 0;
    num[0][1]= 30;
    num[0][2]= 2;
    num[0][5]= 5;
    num[1][0]= 75;
    num[1][4]= 0;
    num[2][2]= -2;
    num[2][3]= 9;
    num[2][5]= 11;
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if(num[i][j]==-1){
          System.out.printf("%3s","XX");
        }
        else{
          System.out.printf("%3d",num[i][j]);
        }
      }
      System.out.println();
    }
  }
}
