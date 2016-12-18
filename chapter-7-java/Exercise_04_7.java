/**
 *
 * @author Ángel López Molina
 */
public class Exercise_04_7 {
  public static void main(String[] args) {
    int[] number= new int [20];
    int[] sqrNumber= new int [20];
    int[] cubNumber= new int [20];
    int aux1= 0;
    int aux2= 0;
    
    for (int i = 0; i < 20; i++){
      
      number[i]= (int)(Math.random()*100);
      sqrNumber[i]= number[i]*number[i];
      cubNumber[i]= sqrNumber[i]*number[i]; 
      
      System.out.printf("%10d %10d %10d \n",number[i],sqrNumber[i],cubNumber[i]);
    }
  }
}
