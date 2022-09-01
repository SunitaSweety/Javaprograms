/*Question 1

Even or Odd
Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.*/



package thirdProgram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		a=s.nextInt();
		if(a%2==0) {
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}