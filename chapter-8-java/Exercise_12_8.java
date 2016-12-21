/**
 *
 * @author Ángel López Molina
 */
public class Exercise_12_8 {
  public static void main(String[] args) {
    
    int row= 9, col= 9;
    
    int a[][]= new int [row][col];
    
    int max= 499;
    int min= 901;
    
    for (int i = 0; i < row; i++) { //Blanks
      for (int j = 0; j < col; j++) {
        a[i][j]= -1;
      }
    }
    
    int iter= col-1;
    for (int i = 0; i < row; i++) { //Numbers
      int times= 0;
      do{
        
        a[i][iter]= (int)(Math.random()*401)+500;
        times++;
        
        if(a[i][iter] > max) max= a[i][iter];
        else if (a[i][iter] < min) min= a[i][iter]; 
        
        if(iter != 0){
          iter--;
        }
      }while(times< 1);
    }
    
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (a[i][j]== -1) {
          System.out.printf("\u001B[0m%6s", "[ ]");
        }
        else{
          if(a[i][j]== min){
            System.out.printf("\u001B[34m%6d",a[i][j]);
          } 
          else if (a[i][j]== max) {
            System.out.printf("\u001B[31m%6d",a[i][j]);
          }
          else{
            System.out.printf("%6d",a[i][j]);
          }
        }
      }
      System.out.println();
    }
  }
}
