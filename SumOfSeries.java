package lopps;

import java.util.Scanner;

class Series{
    public void Sum() {
	double sum_Of_Series = 0;
	int n;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter number for sum of series: ");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
		
		System.out.println( sum_Of_Series+(1.0/i)+" = "+sum_Of_Series);
	}
}
    public class SumOfSeries {

	public static void main(String[] args) {
		Series F=new Series();
		F.Sum();
		

	}

}
}