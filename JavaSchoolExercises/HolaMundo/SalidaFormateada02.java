

public class SalidaFormateada02{

  public static void main (String[]args){
    System.out.printf   ("%-10s      %-10s   %-10s\n","Artículo","Precio/Caja","Nº Cajas");
    System.out.println  ("--------------------------------------");
    System.out.printf   ("%-10s      %.2f      %6d\n", "manzanas", 4.5, 10);
    System.out.printf   ("%-10s      %.2f      %6d\n", "peras", 7.8, 15);

  }

}
