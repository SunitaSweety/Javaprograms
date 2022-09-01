import java.util.Scanner;
public class SwapNo { 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st no.");
		int a = s.nextInt();
		System.out.println("Enter the 2nd no.");
		int b = s.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Reverse 1nd no. "+a);
		System.out.println("Reverse 2nd no. "+ b);
	}

}
