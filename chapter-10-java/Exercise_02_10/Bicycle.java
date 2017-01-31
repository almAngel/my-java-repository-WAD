package Exercise_02_10;

public class Bicycle extends Vehicle{

  Bicycle(){
    Vehicle.vehiclesCount+= 1;
    this.wheels= 2;
  }
  
  int getTotalWheels(){
    return this.wheels;
  }
  
  public void move(){
    this.kilometersTravelled=0;
    this.kilometersTravelled+=1;   
    Vehicle.totalKilometers+= this.kilometersTravelled;
    System.out.println("The bicycle moves it's "+ this.wheels + " wheels.");
  }
  
  public void wheelie(){
    System.out.println("The bicycle starts making a wheelie.");
  }
  
  public void infoKilometers(){
    System.out.println("Kilometers with this bike: " + this.kilometersTravelled);
  }
  
}
