package lopps;

import java.util.Scanner;

class LogarithmOf2Series{
	void series() {
		double result =0;
		int sign=1;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the length of Series: ");
		int n=S.nextInt();
		for(int i=1;i<=n;i++) {
			result=result+(sign*1.0)/i;
			sign=sign*-1;
			}
		System.out.println("log2 = "+result);
	}
}

public class NaturalLogarithmOf2 {

	public static void main(String[] args) {
		LogarithmOf2Series R=new LogarithmOf2Series();
		R.series();
		}
}


