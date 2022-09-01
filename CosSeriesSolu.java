package lopps;

import java.util.Scanner;

public class CosSeriesSolu {

	public static void main(String[] args) {
		
			Scanner Num = new Scanner(System.in);
			System.out.println("Enter the value of Cos of x: ");
			int x = Num.nextInt();
			System.out.println("Enter the length of Cos series: ");
			int n = Num.nextInt();
			double sum = 0;
			double sign = 1;
			for(int index = 0;index <= n;index += 2) {
				double power = SinSeriesMethods.power(x, index);
				double factorial = SinSeriesMethods.factorial(index);
				sum = sum + sign*(power/factorial);
				sign = sign*-1;
		  }
			System.out.println("Cos"+x+" = "+sum);
		
	}

}
