package Exercise_02_10;

public class Car extends Vehicle{
  
  Car(){
    Vehicle.vehiclesCount+= 1;
    this.wheels= 4;
  }
  
  int getTotalWheels(){
    return this.wheels;
  }
  
  public void move(){
    this.kilometersTravelled=0;
    this.kilometersTravelled+=3;
    Vehicle.totalKilometers+= this.kilometersTravelled;
    System.out.println("The car moves it's "+ this.wheels + " wheels.");
  }
  
  public void burnWheels(){
    System.out.println("The car starts burning its 2 back wheels.");
  }
  
  public void infoKilometers(){
    System.out.println("Total kilometers: " + this.kilometersTravelled);
  }
  
}
