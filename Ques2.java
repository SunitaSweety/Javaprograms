/*a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.*/



package Arrayutil;

public class Ques2 {

	public static void main(String[] args) {
		String []dayName = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		for(String i : dayName) {
			System.out.println(i +" ");
		}
	}
}
