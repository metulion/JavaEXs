package application;

import java.util.*;

public class JAVA_EX_02  {
	
	public static  void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit number.");
		int limitNumber = scan.nextInt();
		int result = calculatePrimeNumbers(limitNumber);
		
	}
	
	
	
	public static  int calculatePrimeNumbers(int limitNumber) {
		int result = -1  ;
		int counter=1;
		if(limitNumber<2) {
			System.out.println("There is no Prime number under 2.");
			return  result;
		}
			
		else System.out.println("Prime Numbers until the limit number:\n2 ");
		
		for(int i=3 ; i<=limitNumber; i+=2) {
			int j=2;
			for(; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					break;
					}
				if(i%j!=0) {
					continue;
				}
			}
			if(j>Math.sqrt(i)) {
				System.out.println(i);
				counter++;
			}
		}
		if(limitNumber>=2) {
			System.out.println("Total prime numbers = " + counter);
			return counter;
		}
		return 0;
	}
	
}
