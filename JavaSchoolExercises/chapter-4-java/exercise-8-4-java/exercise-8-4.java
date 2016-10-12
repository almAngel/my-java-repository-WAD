package chapter_4_java.pack;


import java.time.LocalDate;
import java.util.Scanner;


public class exercise_8_4 {
	
	public static void main (String []args){
		
		Scanner s = new Scanner (System.in);
		
		// User info.
		
		System.out.println ("Your score's bulletin... ");
		
		System.out.println ("Enter your first name and surname: ");
		String entireName = s.nextLine();
		
		System.out.println ("Enter your grade: ");
		String grade = s.nextLine();
		
		System.out.println ("Enter the first score: ");
		float score1 = Float.parseFloat(s.nextLine());
		System.out.println ("Enter the second score: ");
		float score2 = Float.parseFloat(s.nextLine());
		System.out.println ("Enter the third score: ");
		float score3 = Float.parseFloat(s.nextLine());
		
		float operation = (score1 + score2 + score3 )/3;
		
		
		System.out.printf (" %s \n ", " ________________________________________");
		System.out.printf (" %s Student Name: %s \n ","|", entireName);
		System.out.printf (" %s Date: %s \n ", "|", LocalDate.now() );
		System.out.printf (" %s Grade: %s \n ", "|", grade);
		System.out.printf (" %s \n ", "|");
		System.out.printf (" %s Course's average score %.2f \n ", "|", operation);
		System.out.printf (" %s \n ", "----------------------------------------");
		
	}
}
