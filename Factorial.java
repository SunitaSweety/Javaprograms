/*Question 4

Write a program to find the factorial value of any number entered through the keyboard. */




package lopps;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,fac=1;
		Scanner no = new Scanner(System.in);
		System.out.println("Enter a number for factorial: ");
		n=no.nextInt();
		for(i=1;i<=n;i++)
		{
			fac=fac*i;
		}
		System.out.println("Fcatorial of given number is: "+fac);
		
		

	}

}
