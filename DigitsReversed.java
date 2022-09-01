/*Question 6

Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example,
if the input is 12345, the output should be 54321.*/

import java.util.Scanner;

public class DigitsReversed {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = s.nextInt();
		int temp = no;
		int rev = 0,rem;//rem=remainder
		while(temp!=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
			System.out.print(rem);
		}

	}

}
