import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		 Scanner stu=new Scanner(System.in);
		// String name;
		 float maths  ;
		 float Science ;
		 float Computer;
		 float Hindi;
		// Scanner stu=new Scanner(System.in);
		String name=stu.next();
		 System.out.println("Enter Student name:  "+name);
		 maths=stu.nextFloat();
		 System.out.println("Enter Maths number: "+maths);
		 Science=stu.nextFloat();
		 System.out.println("Enter Science Number: "+Science);
		 Computer=stu.nextFloat();
		 System.out.println("Enter Computer Number: "+Computer);
		 Hindi=stu.nextFloat();
		 System.out.println("Enter Hindi Number: "+Hindi);
		 }

}
0