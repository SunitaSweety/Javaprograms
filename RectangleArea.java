package FirstProgram;
import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		int length;
		int width;
		int area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr the number of length of Rectangle");
		length = s.nextInt();
		System.out.println("Enter the number of width of Rectangle ");
		width = s.nextInt();
		area=length*width;
		System.out.println("Area of the Rectangle is " +area);
		
		
		
	}

}
