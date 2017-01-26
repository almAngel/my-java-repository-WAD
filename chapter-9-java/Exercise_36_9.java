import java.util.Scanner;

import MisArrays.MyArrayFunc;
import MisFunciones.CMaths;

public class Exercise_36_9 {
  public static void main (String[]args){
    Scanner sc= new Scanner (System.in);
    
    int[] n= {2,4,5};
    int[] a= MyArrayFunc.primeFilter(n);
    
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }   
  }
}
