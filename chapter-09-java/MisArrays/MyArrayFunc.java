package MisArrays;

import MisFunciones.CMaths;

public class MyArrayFunc {

  public static int[] createArrayN (int n, int s){
    int[] a= new int [s];
    
    return a;
  }
  
  public static int[] randArray (int s, int min, int max){
    int n= 0;
    
    int[] ran= new int [s];
    
    for (int i = 0; i < ran.length; i++) {
      n= (int)(Math.random()*(max-min)+1)+min;
      ran[i]= n;
    }
    
    return ran;
  }
  
  public static int minNumArray (int n[]){
    int min= Integer.MAX_VALUE; 
    for (int i = 0; i < n.length; i++) {
      if(n[i]< min){
        min= n[i];
      }
    }
    return min;
  }
  
  public static int maxNumArray (int n[]){
    int max= Integer.MIN_VALUE;
    for (int i = 0; i < n.length; i++) {
      if(n[i]> max){
        max= n[i];
      }
    }
    return max;
  }
  
  public static int averageArray (int n[]){
    int sum= 0;
    int aver= 0;
    
    for (int i = 0; i < n.length; i++) {
      sum+= n[i];
    }
    aver= sum/n.length;
    
    return aver;
  }
  
  public static boolean isInsideArray (int n[], int a){
    boolean ins= false;
    for (int i = 0; i < n.length; i++) {
      if(n[i]==a){
        ins= true;
      }
    }
    return ins;
  }
  
  public static int posInArray (int n[], int a){
    int pos= 0;
    for (int i = 0; i < n.length; i++) {
      if(n[i]==a){
        pos= i; 
      }
    }
    return pos;
  }
  
  public static int[] flipArray (int n[]){
    int flip= 0;
    int[] m= new int [n.length];
    int d= 0;
    int count= 0;
    
    for (int i = 0; i < n.length; i++) { //Juntar los numeros del array en uno solo.
      flip= (flip*10)+ n[i];
    }   
    while (flip > 0 && count < m.length){ //Meter numeros en el otro array.
      d= flip%10;
      m[count]= d;
      count++;
      flip/= 10;
    }
    return m;
  }
//=======================================================================================  
  public static int[] rotateArrayRight (int n[]){
    int aux= n[n.length-1];
    
    for (int i = n.length-1 ; i > 0; i--) { //Juntar los numeros del array en uno solo.
      n[i]= n[i-1];
    }
    n[0]=aux;
    
    return n;
  }
  
  public static int[] rotateArrayLeft (int n[]){
    int aux= n[0];
    
    for (int i = 0 ; i < n.length-1; i++) { //Juntar los numeros del array en uno solo.
      n[i]= n[i+1];
    }
    n[n.length-1]=aux;
    
    return n;
  }
  
  /*public static int[] primeFilter (int[] n){
    int aux= 0;
    int[] m= new int[n.length];
    for (int i = 0; i < n.length; i++) {
      if(MyFunctions.prime(n[i])){
        aux= n[i];
      }
      m[i]= aux;
    }
    return m;
  }*/
  
  public static int[] converToArray (long n){
    int x= 0;
    int[] a= new int[CMaths.countDigits(n)];
    
    for (int i = a.length-1; i >= 0; i--){
      x= (int)n%10;
      
      a[i]= x;
      n/= 10;
    }
    return a;
  }
  
  public static long converToNumber (int n[]){
    long aux= 0;
    
    for (int i = 0; i < n.length; i++){
      aux= (aux*10)+ n[i];
    }
    return aux;
  }
  
  public static int[] primeFilter (int n[]){
    int x= 0;
    //int[] a= new int [n.length];
    int count= 0;
    long aux= 0;
    int[] a= new int [1];
    
    for (int i = 0; i < n.length; i++){
      x= n[i];
      if(CMaths.prime(n[i])){
        count++;
        aux= (aux*10)+ x;
      }
    }
    
    if(count > 0){
      int[] b= new int[count];
      for (int i = b.length-1; i >= 0; i--) {
        b[i]= (int)aux%10;
        aux/= 10;
      }
      return b;
    }
    else{
      a[0]= -1;
    }
    
    return a;
  }
  
  public static int[] capicuaFilter (int n[]){
    int x= 0;
    int count= 0;
    int aux= 0;
    int[] a= new int [1];
    //int digits= 0;
    
    for (int i = 0; i < n.length; i++) {
      x= n[i];
      
      if(CMaths.capicua(x)){
        count++;
       
      }
    }
    return a;
    
  }
  
}
