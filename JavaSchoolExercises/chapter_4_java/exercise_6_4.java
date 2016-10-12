package chapter_4_java.pack;


import java.util.Scanner;





public class exercise_6_4 {

	//Const.
	
	public static float grav = 9.81f;
		
	
	public static void main (String[]args){
	

	Scanner s = new Scanner (System.in);
	
	System.out.println ("Calculate the time an object which travels between falling and hitting the ground...");
	System.out.println ("Introduce the height *h* value: ");
	
	float height = Float.parseFloat(s.nextLine());
	
	double operation = Math.sqrt((2* height)/grav);
	
	System.out.printf ("Result: %.2f %s", operation, "secs.");
	
	}
	
}

