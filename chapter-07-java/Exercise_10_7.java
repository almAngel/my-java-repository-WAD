/**
 *
 * @author Ángel López Molina
 */
public class Exercise_10_7 {
  public static void main(String[] args) {
    
    int [] myArray1= new int [20];//Normal
    int [] myArray2= new int [20];//Pair
    int [] myArray3= new int [20];//Odds
    int [] myArray4= new int [20];//Result
    
    int pairs= 0;
    int odds= 0;
    
    for (int i = 0; i < myArray1.length; i++) {
      myArray1 [i] = (int)(Math.random()*101);
      
      if(myArray1[i]%2==0){
        myArray2[pairs++]=myArray1[i];
      }
      else{
        myArray3[odds++]=myArray1[i];
      }
      
    }
    for (int j = 0; j < myArray1.length; j++) { //Show 1st array.
      System.out.print(myArray1[j]+ " ");
    }
    
    for (int i = 0; i < pairs; i++) {
      myArray4[i]= myArray2[i]; 
    }
    for (int i = pairs; i < 20; i++) {
      myArray4[i]= myArray3[i-pairs];
    }
    
    
    System.out.println();
    for (int k = 0; k < myArray4.length; k++) { //Show final array
      System.out.print(myArray4[k]+ " ");
    }
    
  }
}
