
package MisFunciones;

/**
 *
 * @author Angel
 */
public class MyFunctions {
	
	
	//###### CAPICUA ######
	public static boolean Capicua (int n){
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
	public static boolean Prime (int n){
		boolean a= true;
		
		for (int i = n-1; i > 1; i--) {
			if(n%i == 0){
				a= false;
			}
		}
		return a;
	}
	//--------------------------------------
	
	//###### NEXT PRIME ######
	public static int NextPrime(int n){
		while (!Prime(++n)){}
		return n;
	}
	//--------------------------------------
	
	//###### POWER ######
	public static int PowerN(int n, int t){
		for (int i = 1; i < t; i++) {
			n*=n;
		}
		return n;
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
    long aux= n;
    long flip= 0;
    int digits= 0;
    while (n > 0){
      flip= (flip*10)+ (n%10);
      n/=10;
      digits++;
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
    long reFlip= 0;
    
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
  
  public static long decimalToBinary(long n){
    long c= 0;
    long r= 0;
    long f= 0;
    
    while (n > 0){
      c= n/2;
      r= n%2;
      f= (f *10) + r;
      
      n= c;
    }
    return f;
  }
}
