package Exercise_02_10;

public class Vehicle {

  public static int vehiclesCount, totalKilometers;
  public int kilometersTravelled, wheels;
  
  static int getVehiclesCount(){
    return Vehicle.vehiclesCount;
  }
  
  int getTotalKilometers(){
    return Vehicle.totalKilometers;
  }
  
  int getKilometersTravelled(){
    return this.kilometersTravelled;
  }
  
  void setTotalKilometers(){
    Vehicle.totalKilometers+= kilometersTravelled;
  }
  
  public static void infoTotalKilometers(){
    System.out.println("Total kilometers: "+ Vehicle.totalKilometers);
  }
  
}
