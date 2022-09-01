package thirdProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	 Scanner y=new Scanner(System.in);
	 System.out.println("Enter a year: ");
	 int year=y.nextInt();
	 if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0))
	 {
		 System.out.println("Year is leap year.");
	 }
	 else
	 {
		 System.out.println("Year is not a leap year.");
	 }
	}
}
