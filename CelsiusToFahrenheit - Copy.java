/*Question 3.

Celsius to Fahrenheit
Write a program that asks for a temperature in Celsius and prints out the temperature in Fahrenheit.
 Use InputBox for input and OutputBox for output. The formula to convert Celsius to the equivalent Fahrenheit is:
fahrenheit = 1.8 x celsius + 32*/

package FirstProgram;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
	String input;
	double faher;
	double cels;
    Scanner F=new Scanner(System.in);
	input = JOptionPane.showInputDialog("Enetr temperature in celsius: ");
	cels = Double.parseDouble(input);
	faher =  (1.8 * cels + 32);
    JOptionPane.showMessageDialog(null,"temperature in Fehrenheit: "+faher);
    }
}
