
import java.util.Scanner;

/**
 *
 * @author Ángel López Molina
 */
public class Exercise_11_7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    int [] n= new int [10];//FIRST
    int [] m= new int [10];//PRIMES
    int [] x= new int [10];//NON PRIMES 
    int [] y= new int [10];//FINAL
    
    int primes=0;
    int nonPrimes= 0;
    boolean isPrime= true;
    
    for (int i = 0; i < 10; i++){
      System.out.println("Introduce a number: ");
      n[i]= Integer.parseInt(s.nextLine());
      
      isPrime= true;
      for (int j = 2; j < n[i]-1; j++) { //CHECK PRIME NUMBERS.
        if(n[i]%j==0){
          isPrime= false;
        }
      }
      
      if (isPrime) {
        m[primes++]= n[i];
      }
      else{
        x[nonPrimes++]= n[i];
      }
    }
    
    for (int i = 0; i < primes; i++) {
      y[i]= m[i];
    }
    for (int i = primes; i < primes+nonPrimes; i++) {
      y[i]= x[i-primes];
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(y[i]+ " ");
    }
  }
}
