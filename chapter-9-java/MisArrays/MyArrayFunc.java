package MisArrays;

public class MyArrayFunc {

  public static int[] arrayIntGen (int s, int min, int max){
    int n= 0;
    
    int[] ran= new int [s];
    
    for (int i = 0; i < ran.length; i++) {
      n= (int)(Math.random()*max)+min;
      ran[i]= n;
    }
    
    return ran;
  }
  
  
  
}
