/**
 *
 * @author Ángel López Molina
 */
public class Exercise_15_6 {
  public static void main(String[] args) {
    
    boolean firstTime= true;
    String firstNote= " ";
    String musicalNote= " ";
    int totalNotes= 0;
    int beats= 28/4;
    
    for (int i = 1; i <= beats; i++) {
      
      if (i<7){ 
        for (int j = 1; j <= 4; j++) {
          totalNotes= (int)(Math.random()*7)+1;
          switch (totalNotes){ //START SWITCH.
            case 1:
              musicalNote= " do";
              if (firstTime){
                firstNote= " do";
              }
              break;
            
            case 2:
              musicalNote= " re";
              if (firstTime){
                firstNote= " re";
              }
              break;
            case 3: 
              musicalNote= " mi";
              if (firstTime){
                firstNote= " mi";
              }
              break;
            case 4: 
              musicalNote= " fa";
              if (firstTime){
                firstNote= " fa";
              }
              break;
            case 5: 
              musicalNote= " sol";
              if (firstTime){
                firstNote= " sol";
              }
              break;
            case 6: 
              musicalNote= " la";
              if (firstTime){
                firstNote= " la";
              }
              break;
            case 7: 
              musicalNote= " si";
              if (firstTime){
                firstNote= " si";
              }
              break;
            
            default:
          }//END SWITCH.
          firstTime= false;
          System.out.print(musicalNote );
        }// END SECOND FOR.
        System.out.print(" |");
      }
      else{
        for (int j = 1; j <= 3; j++) {
          totalNotes= (int)(Math.random()*7)+1;
          switch (totalNotes){ //START SWITCH.
            case 1:
              musicalNote= " do";
              if (firstTime){
                firstNote= " do";
              }
              break;
            
            case 2:
              musicalNote= " re";
              if (firstTime){
                firstNote= " re";
              }
              break;
            case 3: 
              musicalNote= " mi";
              if (firstTime){
                firstNote= " mi";
              }
              break;
            case 4: 
              musicalNote= " fa";
              if (firstTime){
                firstNote= " fa";
              }
              break;
            case 5: 
              musicalNote= " sol";
              if (firstTime){
                firstNote= " sol";
              }
              break;
            case 6: 
              musicalNote= " la";
              if (firstTime){
                firstNote= " la";
              }
              break;
            case 7: 
              musicalNote= " si";
              if (firstTime){
                firstNote= " si";
              }
              break;
            
            default:
          }//END SWITCH.
          firstTime= false;
          System.out.print(musicalNote );
        }// END SECOND FOR.
        System.out.print(firstNote +" ||");
      }
    }// END FIRST FOR.
  }
}