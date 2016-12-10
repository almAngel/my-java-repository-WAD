/**
 *
 * @author Ángel López Molina
 */
public class Exercise_11_6 {
  public static void main(String[] args) {
    int randomizeS= 0;
    String score= " ";
    int npCount= 0; //Not passed count.
    int sfCount= 0; //Sufficient count.
    int gdCount= 0; //Good count.
    int rkCount= 0; //Remarkable count.
    int exCount= 0; //Excellent count.
    
    for (int i = 1; i <= 20; i++) {
      randomizeS= (int)(Math.random()* 5)+1;
      switch(randomizeS){
      
        case 1: 
          score= "Not passed";
          npCount++;
          break;
        case 2: 
          score= "Sufficient";
          sfCount++;
          break;
        case 3:
          score= "Good";
          gdCount++;
          break;
        case 4: 
          score= "Remarkable";
          rkCount++;
          break;
        case 5: 
          score= "Excellent";
          exCount++;
          break;
        default:
      }
      System.out.println(score);
    }
    System.out.println();
    System.out.println("Total Not Passed: " + npCount);
    System.out.println("Total Sufficient: " + sfCount);
    System.out.println("Total Good: " + gdCount);
    System.out.println("Total Remarkable: " + rkCount);
    System.out.println("Total Excellent: " + exCount);
  }
}
