/**
 *
 * @author Ángel López Molina
 */
public class Ex21alm1 {
  public static void main(String[] args) {
    
    int numero= 0;
    int multiplos= 0;
    
      while (multiplos < 10) {
        numero= (int)(Math.random()*71)+140;
        if(numero%7==0){
          System.out.print(numero+ " ");
          multiplos++;
        }
      }
  }
}
