
/**
 *
 * @author Ángel López Molina
 */
public class Exercise_10_6 { 
  public static void main(String[] args) {
    
    char character= ' ';
    int rChar= 0;
    int rLength= 0;
    
    rChar= (int)(Math.random()*6) +1;
    
    for (int i = 0; i < 10; i++) {
      rLength=(int)(Math.random()*40) +1;
      
      switch(rChar){
        case 1: 
          character= '*';
          break;
        case 2: 
          character= '-';
          break;
        case 3: 
          character= '=';
          break;
        case 4: 
          character= '.';
          break;
        case 5: 
          character= '|';
          break;
        case 6: 
          character= '@';
          break;
        default:
      }
      
      for(int j= 1; j <= rLength; j++){
        System.out.print(character);
      }
      //System.out.print(" Times printed: "+ rLength);
      System.out.println();
    }
    
  }
}
