/*Question 6.

Hours, Minutes and Seconds
Write a program that asks the user to enter seconds as integer. The program should compute and display the number of hours, number of minutes and number of seconds in that seconds.
For example if user enters 4205 seconds. The answer should be
Hours : 1
Minutes : 10
Seconds : 5*/

package FirstProgram;

import java.util.Scanner;

public class HoursMinutesAndSeconds {

	public static void main(String[] args) {
		int second;
		Scanner M = new Scanner(System.in);
		System.out.println("Enter the time in second ");
		second =M.nextInt();
		 int hours = second/ 3600;
		 second = second% 3600;
	     int minutes = second/ 60;
	     second = second% 60;
	     System.out.println("Hours: " + hours);
	     System.out.println("minutes: "+minutes);
	     System.out.println("seconds: "+second);

		

	}

}
