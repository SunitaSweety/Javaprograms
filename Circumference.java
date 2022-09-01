/*Ques

Area and Circumference of Circle
Write a program that inputs from the user the radius of a circle as an integer and prints the circle’s circumference and area using the predefined constant Math.PI. Use the following formulas (r is the radius):
circumference = 2πr
area = πr2*/

package FirstProgram;
import java.util.Scanner;

public class Circumference {
	public static void main(String[] args) {
		int radius;
		double area;
		double circfere;
		Scanner R = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		radius=R.nextInt();
		area = Math.PI * radius* radius;
		System.out.println("Area of Circle: ");
		System.out.println(area);
		circfere = Math.PI*radius*2;
		System.out.println("Circumferece of the circle is: ");
		System.out.println(circfere);
		}
}
