/**
 *
 * @author Ángel López Molina
 */
public class Exercise_03_6 {
  public static void main(String[] args) {
    
    int randomNum1= (int)(Math.random()*4)+1;
    int randomNum2= (int)(Math.random()*10)+1;
    
    if(randomNum1==1){
      if (randomNum2== 8){
        System.out.println("Sota de Oros");
      }
      else if (randomNum2== 9){
        System.out.println("Caballo de Oros");
      }
      else if (randomNum2== 10){
        System.out.println("Rey de Oros");
      }
      else if (randomNum2== 1){
        System.out.println("As de Oros");
      }
      else{
        System.out.println(randomNum2+" de Oros");
      }
    }
    else if (randomNum1==2){
      if (randomNum2== 8){
        System.out.println("Sota de Copas");
      }
      else if (randomNum2== 9){
        System.out.println("Caballo de Copas");
      }
      else if (randomNum2== 10){
        System.out.println("Rey de Copas");
      }
      else if (randomNum2== 1){
        System.out.println("As de Copas");
      }
      else{
        System.out.println(randomNum2+" de Copas");
      }
    }
    else if (randomNum1==3){
      if (randomNum2== 8){
        System.out.println("Sota de Bastos");
      }
      else if (randomNum2== 9){
        System.out.println("Caballo de Bastos");
      }
      else if (randomNum2== 10){
        System.out.println("Rey de Bastos");
      }
      else if (randomNum2== 1){
        System.out.println("As de Bastos");
      }
      else{
        System.out.println(randomNum2+" de Bastos");
      }
    }
    else if (randomNum1==4){
      if (randomNum2== 8){
        System.out.println("Sota de Espadas");
      }
      else if (randomNum2== 9){
        System.out.println("Caballo de Espadas");
      }
      else if (randomNum2== 10){
        System.out.println("Rey de Espadas");
      }
      else if (randomNum2== 1){
        System.out.println("As de Espadas");
      }
      else{
        System.out.println(randomNum2+" de Espadas");
      }
    }
  }
}
