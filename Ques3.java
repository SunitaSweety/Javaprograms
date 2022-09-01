/*Question 3

Write a program that creates an array of 10 elements size.
Your program should prompt the user to input numbers in array and then display the sum of all array elements.*/



package Arrayutil;

import java.util.Scanner;

public class Ques3 {
	public static void sum( int[] input) {
	    int result = 0;
		for(int no=0;no<input.length;no++) {
			result = result+input[no];
			}
		System.out.println("Sum of elemetns are: "+ result);
	}
	public static void main(String[] args) {
		Scanner add = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = add.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements of the array ");
		for(int i=0;i<array.length;i++) {
			array[i] = add.nextInt();
		}
		sum(array);
	}
	
 }

