import java.util.Scanner;



public class Animal {
	int a,b,c;
	public void sum()
	
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=s.nextInt();
		System.out.println("Enter second number: ");
		b=s.nextInt();
		c=a+b;
		System.out.println("sum is: "+c);
     
	}
    public static void main(String[] args) {
    	Animal S1=new Animal();
    	S1.sum();
		
	}
}
