package Exercise_02_10;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in); 
    boolean repeat= true;
    
    
    Bicycle b= new Bicycle ();
    Car c= new Car();
    
    System.out.println("1. Move the bicycle");
    System.out.println("2. Make a wheelie.");
    System.out.println("3. Move the car.");
    System.out.println("4. Burn wheels with the car.");
    System.out.println("5. See the kilometers travelled by the bicycle.");
    System.out.println("6. See the kilometers travelled by the car.");
    System.out.println("7. See the total kilometers.");
    System.out.println("8. Exit.");
    System.out.println();
    
    while (repeat){
      
      System.out.println("Introduce an option: ");
      int option= sc.nextInt();
      
      switch(option){
      
        case 1: 
          b.move();
          break;
          
        case 2:
          b.wheelie();
          break;
          
        case 3:
          c.move();
          break;
          
        case 4:
          c.burnWheels();
          break;
          
        case 5:
          b.infoKilometers();
          break;
          
        case 6:
          c.infoKilometers();
          break;
          
        case 7:
          Vehicle.infoTotalKilometers();
          break;
          
        case 8:
          repeat= false;
          System.out.println("Total vehicles summoned: "+ Vehicle.getVehiclesCount());
          break;
          
        default:
          System.out.println("Introduce a valid option.");
          System.out.println();
          break;
      }
          
    }
    
    sc.close();
  }
}
