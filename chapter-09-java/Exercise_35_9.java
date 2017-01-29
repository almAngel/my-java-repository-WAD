import java.util.Scanner;

import MisFunciones.CMaths;

public class Exercise_35_9 {
  public static void main (String[]args){
    Scanner sc= new Scanner (System.in);
    
    System.out.println("Num: ");
    long n= sc.nextLong();
    
    int nDigits= CMaths.countDigits(n); //Contar digitos
    n= CMaths.flip(n); //Vuelta
    int count= 0;
    long a= 0;
    
    for (int i = count; i < nDigits; i++) {
      count++;
      a= n%10;
      for (int j = 0; j < a; j++) {
        if(i != count){
          System.out.print(" |");
        }
      }
      if(i != nDigits-1){
        System.out.print(" -");
      }
      n/= 10;
    }
    sc.close();
  }
}
