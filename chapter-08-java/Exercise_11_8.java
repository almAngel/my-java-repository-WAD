/**
 *
 * @author Ángel López Molina
 */
public class Exercise_11_8 {
  public static void main(String[] args) {
    
    int row= 10, col= 10;
    
    int a[][]= new int [row][col];
    
    int max= 199;
    int min= 301;
    
    for (int i = 0; i < row; i++) { //Blanks
      for (int j = 0; j < col; j++) {
        a[i][j]= -1;
      }
    }
    
    int iter= 0;
    for (int i = 0; i < col; i++) { //Numbers
      int times= 0;
      do{
        
        a[iter][i]= (int)(Math.random()*101)+200;
        times++;
        
        if(a[iter][i] > max) max= a[iter][i];
        else if (a[iter][i] < min) min= a[iter][i]; 
        
        if(i != col){
          iter++;
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
