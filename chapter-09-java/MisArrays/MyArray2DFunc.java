package MisArrays;

public class MyArray2DFunc {

  public static int[][] randArray2D (int n,int m, int min, int max){
    int r= 0;
    int[][] ran= new int [n][m];
    
    for (int i = 0; i < ran.length; i++) {
      for (int j = 0; j < ran.length; j++) {
        r= (int)(Math.random()*(max-min)+1)+min;
        ran[i][j]= r;
      }
    }
    return ran;
  }
  
  public static void showArrayRow (int n[][], int row){
    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < n.length; j++){
        System.out.printf("%3d",n[row][j]);
      }
    }
  }
  
  public static void showArrayCol (int n[][], int col){
    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < n.length; j++){
        System.out.printf("%3d",n[j][col]);
      }
    }
  }
  
  public static void showNumCoords (int m[][], int n){
    int x= 0,y= 0;
    boolean exists= false;
    //int [] b= {x,y}; 
     
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        if(m[i][j]== n){
          x= i+1;
          y= j+1;
          exists= true;
        }
      }
    }
    if(exists){
      System.out.printf("%2d:%2d",x,y);
    }
    else System.out.printf("%2d:%2d",-1,-1);
  }
  
  public static void saddlePoint (int m[][], int n){
    int x= 0, y= 0, min= Integer.MAX_VALUE, max= Integer.MIN_VALUE;
    
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        if(m[i][j] == n){
          x= i;
          y= j;
        }
      }
    }
    
    for (int i = 0; i < m.length; i++) {
      if(m[x][i] < min){
        min= m[x][i];
      }
    }
    
    for (int i = 0; i < m.length; i++) {
      if(m[i][y] > max){
        max= m[i][y];
      }
    }
    if(min==n && max==n){
     System.out.println("This number is saddle point"); 
    }
    else System.out.println("This number is not saddle point");
  }
}
