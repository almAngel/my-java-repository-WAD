/**
 *
 * @author Ángel López Molina
 */
public class Ex21alm3 {
  public static void main(String[] args) {
    
    int numeroGenerado= (int)(Math.random()*100000);
    int vuelta= 0;
    int numDigitos= 0;
    int sumaDigitos= 0;
    int aux= 0;
    int margen= 20;
    int numEspacios= 0;
    
    //###### CUENTO LOS DIGITOS ######
    while(numeroGenerado>0){ //Mientras el numero no llegue a cero.
      aux= numeroGenerado;//numero copiado
      vuelta= (vuelta*10)+(aux%10); //valor de vuelta
      numeroGenerado/=10;//numero se acorta
      numDigitos++;
    }
    //-------------------------------------------------------
    int[] n= new int[numDigitos];
    //###### LE DOY LA VUELTA OTRA VEZ Y EXTRAIGO CADA DIGITO PARA SUMARLOS ###### 
    for (int i = 0; i < n.length && vuelta >0; i++) {
      n[i]= (vuelta%10);
      vuelta/=10;
      sumaDigitos+=n[i];
    }
    //---------------------------------------------------------------
    
    //###### TEST SUMA DIGITOS ######
    
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i]+" ");
    }
    System.out.println("\n"+sumaDigitos);
    //---------------------------------------------------------------
    
    //###### PINTO ######
    
    
      for (int leer = 0; leer < n.length; leer++) { //PARA LEER ELEMENTOS DE ARRAY
        numEspacios= (n[leer]-1);
        
        if(leer%2 ==0){ //SI EL INDICE ES PAR
          
          for (int i = n[leer]; i > 0; i--) {
            for (int k = 0; k < 20+numEspacios; k++) { //PINTO ESPACIOS DESCENDENTES
            
              System.out.print(" ");
            }
            System.out.println("*");
            numEspacios--;
          }
          numEspacios= 0;
          
        }
        else{ // SI ES IMPAR
          
          for (int i = n[leer]; i > 0; i--) {
            for (int k = 0; k < (20-n[leer])+numEspacios; k++) { //PINTO ESPACIOS
              System.out.print(" ");
            }
            numEspacios++;
            System.out.println("*"); 
          }
          numEspacios= 0;
        }   
      }
  }
}
