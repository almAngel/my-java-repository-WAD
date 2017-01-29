
package MisFunciones;

import MisArrays.MyArrayFunc;

/**
 *
 * @author Angel
 */
public class CMaths {
	
	
	//###### CAPICUA ######
	public static boolean capicua (int n){
		int aux= 0;
		int  flip= 0;
		
		aux= n;
		while (n > 0){
			flip= (flip*10) + (n %10);
			n/=10;
		}
		if (flip == aux){
			return true;
		}
		else{
			return false;
		}
	}
	//---------------------------------------
	
	//###### PRIME ######
	public static boolean prime (long x){
		boolean a= true;
		
		for (long i = x-1; i > 1; i--) {
			if(x%i == 0){
				a= false;
			}
		}
		return a;
	}
	//--------------------------------------
	
	//###### NEXT PRIME ######
	public static int nextPrime(int n){
		while (!prime(++n)){}
		return n;
	}
	//--------------------------------------
	
	//###### POWER ######
	public static long powerN(long n, int t){
	  long f= 1;
		for (int i = 0; i < t; i++) {
		  f*= n;
		}
		return f;
	}
  //--------------------------------------
  
  public static double average(int[] n){
    double s= 0;
    for (int i = 0; i < n.length; i++) {
      s+= n[i];
    }

    return s/(double)n.length;
    
  }
  //--------------------------------------
  
  //###### COUNT DIGITS ######
  
  public static int countDigits(long n){
    int digits= 0;
    long a= 0;
    while (n > 0){
      a=n%10;
      digits++;
      n/=10;
    }
    return digits;
  }
  //--------------------------------------
  
  //###### FLIP ######
  
  public static long flip(long n){
    long flip= 0;
    while (n > 0){
      flip= (flip*10)+ (n%10);
      n/=10;
    }
    return flip;
  }
  //-------------------------------------
  
  //###### n DIGIT POS ###### 
  
  public static int nDigit (long n, int n2){
    long flip= 0;
    int pos= 0;
    //long reFlip= 0;
    
    while (n > 0){
      flip= (flip*10)+ (n%10);
      n/=10;
    }
    for (int i = 0; i < countDigits(flip); i++) {
      if(flip%10 != n2){
        pos++;
      }
      flip/=10;
    }  
    return pos;
  }
  
  public static long eraseNumbersRight (long n, int t){
    //int c= countDigits(n);
    for (int i = 0; i < t; i++) {
      n/=10;
    }
    return n;
  }
  
  public static long eraseNumbersLeft (long n, int t){
    long f= flip(n);
    for (int i = 0; i < t; i++) {
      f/=10;
    }
    long f2= flip(f);
    
    return f2;
  } 
  
  public static int countIntroducedNumbers (long n){
    int count= 0;
    count++;
    
    return count;
  }
  
  public static long putDigitRight (long n, int d){
    n*= 10;
    n+= d;
    
    return n;
  }
  
  public static long putDigitLeft (long n, int d){
    long f= flip(n)*10;
    f+= d;
    long f2= flip(f);
    
    return f2;
  }
  
  public static long eraseTwoSegments (long n, int p1, int p2){
    for (int i = 0; i < p2; i++) {
      n/=10;
    }
    long f= flip(n);
    
    for (int i = 0; i < p1; i++) {
      f/=10;
    }
    long f2= flip(f);
    
    return f2;
  }
  
  public static long joinNumbers(long n, long n2){
    int c= countDigits(n2);
    
    for (int i = 0; i < c; i++) {
      n*=10;
    }
    long f= n + n2;
    
    return f;
  }
  
  public static long binaryToDecimal(long n){
    long sum= 0;
    long pow= 0;
    long aux= n;
    
    for (int i = 0; i < countDigits(n); i++) {
      pow= powerN(2, i);
      
      if (aux%10 == 1){
        sum+= pow;
      }
      aux/=10;
    }
    return sum;
  }
  
  public static String decimalToBinary(long n){
    //long f= 0;
    String a= "";
    int i= 0;
    long p= 0;
    
    do{ //Veces que puede contener n a 2.
      p = (long)powerN(2, i);
      i++;
    }while(n/p!= 0);
    p/=2; //El siguiente mÃ¡s pequeÃ±o que n potencia de 2.
    
    
    if(n== 0){ //Si n= 0: Out(0).
      a+= "0";
    }
    else{
      do{
        if(n/p == 1){
          a+= "1";
          n-= p;
        }
        else {
          a+= "0";
        }
        p/=2;
      }while(p != 0);
    }
    return a;
  }
  
  public static void numberToPoleSys (long n){
    int nDigits= CMaths.countDigits(n);
    n= CMaths.flip(n);
    int count= CMaths.countDigits(n);
    long a= 0;
    
    for (int i = 0; i < nDigits; i++) {
      a= n%10;
      for (int j = 0; j < a; j++) {
        if(i != count){
          System.out.print(" |");
        }
      }
      if(i != count-1){
        System.out.print(" -");
      }
      n/= 10;
    }
  }
  
  public static String numberToMorseSys (long n){
    String t= "";
    String tAux= "";
    int x= 0;
    int maxDot= 0;
    int maxLine= 0;
    
    int[] a= MyArrayFunc.converToArray(n);
    
    for (int i = 0; i < a.length; i++) {
      maxDot= 5;
      maxLine= 5;
      x= a[i];
      
      if(x >= 0 && x <= 5){
        for (int j = 0; j < x; j++) {
          t+= " ·";
        }
        maxLine-= x;
        for (int j = 0; j < maxLine; j++) {
          t+= " -";
        }   
      }
      else if (x > 5 && x < 10){
        x-= 5;
        for (int j = 0; j < x; j++) {
          t+= " -";
        }
        maxDot-= x;
        for (int j = 0; j < maxDot; j++) {
          t+= " ·";
        }
      } 
      t+= " ||";
    } 
    return t;
  }
  
}
