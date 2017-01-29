

public class Exercise_01_10 {

  public float height, weight;
  private String name, gender;
  public String color, hair;
  public int age;
  
  //### CONSTRUCTOR ###
  Exercise_01_10 (String n,String g){ 
    this.name= n;
    this.gender= g;
  }
  
  String getName(){
    return this.name;
  }
  
  String getGender(){
    return this.gender;
  }
  
  String getColor(){
    return this.color;
  }
  
  String getHair(){
    return this.hair;
  }
  
  float getHeight(){
    return this.height;
  }
  
  float getWeight(){
    return this.weight;
  }
  
  int getAge(){
    return this.age;
  }
  
  void setName(String n){
    this.name= n;
  }
  
  void setGender(String g){
    this.gender= g;
  }
  
  void setColor(String c){
    this.color= c;
  }
  
  void setHair(String h){
    this.hair= h;
  }
  
  void setHeight (float he){
    this.height= he;
  }
  
  void setWeigth (float we){
    this.weight = we;  
  }
  
  void setAge (int a){
    this.age= a;
  }
  
  
}
