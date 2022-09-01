package thirdProgram;

import java.util.Scanner;

public class CheckPositiveNegativeZeroNo {

	public static void main(String[] args) {
		Scanner no=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		float num=no.nextFloat();
		if(num>0)
			System.out.println("Number is Positive.");
		else if(num<0)
			System.out.println("Number is Negative.");
		else
			System.out.println("Number is zero.");
      }

}
