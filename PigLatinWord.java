/*Question 5.

PigLatin Word
Write a program that reads a word as input and converts that word to "Pig Latin". In this version of Pig Latin, you convert a word by removing the first letter, placing that letter at the end of the word, and then appending "ay" to the word. Here is an example:
English Word: night
Pig Latin Word: ightnay*/



package FirstProgram;

import java.util.Scanner;

public class PigLatinWord{
	public static void main(String[] args) {
	
/*		String name = "Night";
		int leng = name.length();
		String rev = "";
		for(int i=leng-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println(name);
		System.out.println( rev+"ay");
*/ 
		String engWord;
		String latWord;
		Scanner W=new Scanner(System.in);
		System.out.println("Enter English Word is: ");
		engWord = W.next();
		latWord=engWord.substring(1)
                + engWord.charAt(0) + "ay";
		System.out.println("Pig Latin Word is: ");
		System.out.println(latWord);
		}

}
