 /*Question 5

Two numbers are entered through the keyboard. Write a program to find the value of one number raised to 
the power of another.(Do not use Java built-in method)*/


package lopps;

import java.util.Scanner;

public class Power_Of_No {

	public static void main(String[] args) {
		int  n1,n2,solution=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter base number: ");
		n1=obj.nextInt();
		System.out.println("Enter power number: ");
		n2=obj.nextInt();
		for(int i=1;i<n2;i++)
		{
			solution=solution*n1;
		}
		System.out.println("result of given numbers: "+solution);
	+//..+}
}
