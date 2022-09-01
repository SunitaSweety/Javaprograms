package thirdProgram;

import java.util.Scanner;

public class ThreeLargestNo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a=s.nextInt();
		System.out.println("Enter the second number: ");
		b=s.nextInt();
		System.out.println("Enter the third number: ");
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("greater Number is first number: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Greater Number is second number: "+b);
		}
		else
		{
			System.out.println("greater Number is third number: "+c);
		}
	}
}