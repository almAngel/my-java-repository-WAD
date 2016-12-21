
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_02_8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num[][]= new int[4][5];
    int aux[][]= new int[4][5];
    
    int row= 4, column= 5;
    int times= row*column; //Cells to fill
    int rowSum= 0;
    int columnSum= 0;
    int totalSum= 0;
    
    //####### INTRODUCE THE VALUES IN THE FIRST ARRAY ######
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println("Introduce a number to fill the cell: ");
        num[i][j]= Integer.parseInt(s.nextLine());
        aux[i][j]= num[i][j];
        times--;
        if (times!=0){
          System.out.println("Cells to fill: "+ times);
        }
      }
    }
    //------------------------------------------------------
    
    for (int i = 0; i < row; i++) {
      rowSum= 0;
      for (int j = 0; j < column; j++) {
        rowSum+= aux[i][j];
        System.out.printf("%4d",aux[i][j]);
      }
      System.out.printf("|%4d\n",rowSum);
    }
    
    for(int i= 0; i < column; i++){
      System.out.print("----------");
    }
    System.out.println("-----------");
    
    for(int i = 0; i < 5; i++) {
      columnSum = 0;
      for(int j = 0; j < 4; j++) {
        columnSum += num[j][i];
      }
      System.out.printf("%4d", columnSum);
      totalSum+= columnSum;
    }
    
    System.out.print("| "+totalSum);
    System.out.println();
  }   
}
