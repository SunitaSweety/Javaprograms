package lopps;

public class SinSeriesMethods {
	public static double power(int x,int y) {
		double p=Math.pow(x,y);
		return p;
		}
	
public static int factorial(int y) {
	int fact=1;

    for(int i=1; i<=y; i++)
    {
        fact *= i;
    }
	return fact;
	
   }
	
}