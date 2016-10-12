package chapter_4_java.pack;

/**
 * 
 * @author angel
 *
 * AAEAS
 */

import java.util.Scanner;

public class exercise_5_4 {
	
	public static void main (String[]args){
		
		Scanner s = new Scanner (System.in);
		
		System.out.println ("1st grade equation resolver...");
		System.out.println ("Enter the value of a & b to resolve x= ax + b: ");
		
		//Vars | Enter the value w/ keyboard.
		
		float a = Float.parseFloat (s.nextLine());
		float b = Float.parseFloat (s.nextLine());
		
		
		float operacion = -(-b)/-(a);
		
		System.out.println ("Result: " + operacion );
		
		
	}
}