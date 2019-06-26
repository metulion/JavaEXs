package javaexamples;

import java.util.Scanner;

public class ALG_EX_02 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word.");
		String theWord = scan.next();
		
		int wordLength=theWord.length();
		int i=0;
		for(; i<wordLength/2; i++) {
			if(theWord.charAt(i)==theWord.charAt(wordLength-i-1)) {
				continue;
			}
			else {
				System.out.println(theWord + "  HAYIR");
				break;
			}
				
		}
		if(i>=wordLength/2) {
			System.out.println(theWord + "  EVET");
		}
		
	}

}
