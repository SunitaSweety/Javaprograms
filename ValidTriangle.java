package thirdProgram;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		Scanner angle=new Scanner(System.in);
		System.out.println("Enter triangle three angles as degree");
		int a=angle.nextInt();
		int b=angle.nextInt();
		int c=angle.nextInt();
		int sum=a+b+c;
		if(sum<=180)
			System.out.println("Given triangle is valid");
		}
	}
