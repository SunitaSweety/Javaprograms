/*Question 3

Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. */

package lopps;

import java.util.Scanner;

public class Multi_Table {

	public static void main(String[] args) {
		int n;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter table nummber: ");
		n = num.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ "x" +i+ "=" +(n*i));
		
		}
		
	}

}
