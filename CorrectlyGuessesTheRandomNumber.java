package lopps;

import java.util.Scanner;

class CorrectlyGuesses{
	void correct() {
		
		Scanner C = new Scanner(System.in);
		System.out.println("Enter the Random Number by User: ");
		int N = C.nextInt();
		System.out.println("Enter the Gusses for the number: ");
		int num = C.nextInt();
		if(N>num ) {
			System.out.println("Gusses number is Small by Random number.");
		}
	    if (N<num) {
				System.out.println("Gusses number is Greater by Random number.");
			}
	    if(N==num) {
	    	System.out.println("Gusses number is equal to random number.");
	    }
     }
}

public class CorrectlyGuessesTheRandomNumber {

	public static void main(String[] args) {
		
		CorrectlyGuesses S=new CorrectlyGuesses();
		S.correct();

	}

}
