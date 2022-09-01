package lopps;

import java.util.Scanner;

public class FibonacciSeries2 {

	public static void main(String[] args) {
	    
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the number for fibonacci Series: ");
		int n = obj.nextInt();
		int a = 0 , b = 1;
        System.out.print(" "+a);
		System.out.print(" "+b);
			int c;
			for(int i=1;i<=n;i++)
			{
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
	
			}
	}

}
