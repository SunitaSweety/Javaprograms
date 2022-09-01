import java.util.Scanner;
public class SumOfArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array");
		int size=s.nextInt();
		int array[]=new int[size];
		int sum=0;
		System.out.print("Enter the element of array");
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
					
		}
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		System.out.println("Sum "+sum);
        }
}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

 