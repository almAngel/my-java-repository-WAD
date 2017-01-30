package Exercise_01_10;


public class Horse {

  public float height, weight;
  private String name, gender;
  public String color, hair;
  public int age;
  public int x;
  public int z;
  
  //### CONSTRUCTOR ###
  Horse (String n,String g){ 
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
  
  void walk(String dir){
    if(dir.equalsIgnoreCase("north")) z+=1;
    if(dir.equalsIgnoreCase("east")) x+=1;
    if(dir.equalsIgnoreCase("south")) z-=1;
    if(dir.equalsIgnoreCase("north-east")) z+=1; x+=1;
    if(dir.equalsIgnoreCase("south-east")) z-=1; x+=1;
    if(dir.equalsIgnoreCase("south-west")) z-=1; x-=1;
    if(dir.equalsIgnoreCase("north-west")) z+=1; x-=1;
  }
  
  void neigh (){
    System.out.println(this.name + " is neighing.");
  }
  
  void jump (){
    System.out.println(this.name + " has jumped of happiness.");
  }
  
  void currentPos(){
    System.out.println(this.name +" location: "+ "x:z");
    System.out.println("                "+  x+ ":"+z);
  }
  
}
