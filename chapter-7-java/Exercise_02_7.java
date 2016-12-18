/**
 *
 * @author Ángel López Molina
 */
public class Exercise_02_7 {
  public static void main(String[] args) {
    
    char[] symbol= new char[10];
    
    symbol[0]= 'a';
    symbol[1]= 'x';
    symbol[4]= '@';
    symbol[6]= ' ';
    symbol[7]= '+';
    symbol[8]= 'Q';
    
    for(int i= 0; i< symbol.length; i++){
      System.out.println(symbol[i]);
    }
    
    //If you declare a character array and you don't set it's values Java understands them as blank spaces. 
  }
}
