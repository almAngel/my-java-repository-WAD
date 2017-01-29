/**
 *
 * @author Ángel López Molina
 */
public class Exercise_13_6 {
  public static void main(String[] args) {
    
    int diceValue1= (int)(Math.random()*6)+1;;
    int diceValue2= (int)(Math.random()*6)+1;;
  
    while (diceValue1 != diceValue2){
      diceValue1= (int)(Math.random()*6)+1;
      diceValue2= (int)(Math.random()*6)+1;
      System.out.print("Dice 1: "+ diceValue1+ "|");
      System.out.println(" Dice 2: "+ diceValue2);
    }
  }
}
