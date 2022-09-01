package thirdProgram;

import java.util.Scanner;

public class DiscountAndRevenue {

	public static void main(String[] args) {
		
		
		        int revenue, price, quantity;
		        int discount = 0; 

		        
		        Scanner s = new Scanner(System.in);

		        System.out.print("Enter price of product: ");
		        price =s.nextInt();

		        System.out.print("Enter quantity of product: ");
		        quantity =s.nextInt();

		       
		        revenue = price * quantity;

		        if (revenue > 5000)
		        {
		            
		            discount = revenue * 10 / 100;
		           
		            revenue = revenue - discount;
		        }
		        System.out.println("discount is"+discount);
		        System.out.println("the net revenue is"+revenue);

	}

}
