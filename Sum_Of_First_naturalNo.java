/*Question 2

Write a program to calculate the sum of first 10 natural number.*/



package lopps; 

public class Sum_Of_First_naturalNo {
       public static void main(String[] args) {
		
		 int Sum = 0;
		for (int n=0;n<10;n++)
		{
			 Sum= Sum + n; 
		}
		
		System.out.println("Sum="+Sum);
        }
}
