/*Question 2.

Area of Triangle
If a triangle has side lengths a,b,c, then the formula for the area of the triangle is 
area = s(s − a)(s − b)(s − c), where s = (a + b + c)/2.Write a program that asks the user 
to enter three sides of triangle. The program should compute and display the area of triangle.*/

package FirstProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		double a,b,c,s,area;
		Scanner length = new Scanner(System.in);
		;
		a=length.nextDouble();
		System.out.println("Enter second side of value of triangle: ");
		b=length.nextDouble();
		System.out.println("Enetr third side of triangle: ");
		c=length.nextDouble();
		s=s = (a + b + c)/2;
		area=Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of the triangle is: ");
		System.out.println(area);
	}

}
