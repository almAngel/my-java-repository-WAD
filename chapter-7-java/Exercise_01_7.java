/**
 *
 * @author Ángel López Molina
 */
public class Exercise_01_7 {
  public static void main(String[] args) {
    
    int[] num= new int[12];
    
    num[0]= 39;
    num[1]= -2;
    num[4]= 0;
    num[6]= 14;
    num[8]= 5;
    num[9]= 120;
    
    for(int i= 0; i < num.length; i++){
      System.out.println(num[i]);
    } 
    
    //When an array has non set values Java sets the cell's value by default to 0.
  }
}
