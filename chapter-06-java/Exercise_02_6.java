/**
 *
 * @author Ángel López Molina
 */
public class Exercise_02_6 {
  public static void main(String[] args) {
    
    int randomNum1= (int)(Math.random()*4)+1;
    int randomNum2= (int)(Math.random()*13)+1;
    
    if(randomNum1==1){
      if (randomNum2== 11){
        System.out.println("J of Spades");
      }
      else if (randomNum2== 12){
        System.out.println("Q of Spades");
      }
      else if (randomNum2== 13){
        System.out.println("K of Spades");
      }
      else if (randomNum2== 1){
        System.out.println("A of Spades");
      }
      else{
        System.out.println(randomNum2+" of Spades");
      }
    }
    else if (randomNum1==2){
      if (randomNum2== 11){
        System.out.println("J of Hearts");
      }
      else if (randomNum2== 12){
        System.out.println("Q of Hearts");
      }
      else if (randomNum2== 13){
        System.out.println("K of Hearts");
      }
      else if (randomNum2== 1){
        System.out.println("A of Hearts");
      }
      else{
        System.out.println(randomNum2+" of Hearts");
      }
    }
    else if (randomNum1==3){
      if (randomNum2== 11){
        System.out.println("J of Diamonds");
      }
      else if (randomNum2== 12){
        System.out.println("Q of Diamonds");
      }
      else if (randomNum2== 13){
        System.out.println("K of Diamonds");
      }
      else if (randomNum2== 1){
        System.out.println("A of Diamonds");
      }
      else{
        System.out.println(randomNum2+" of Diamonds");
      }
    }
    else if (randomNum1==4){
      if (randomNum2== 11){
        System.out.println("J of Clovers");
      }
      else if (randomNum2== 12){
        System.out.println("Q of Clovers");
      }
      else if (randomNum2== 13){
        System.out.println("K of Clovers");
      }
      else if (randomNum2== 1){
        System.out.println("A of Clovers");
      }
      else{
        System.out.println(randomNum2+" of Clovers");
      }
    }
  }
}
