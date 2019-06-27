package controller;

public class Calculation {
	
	
	public static double sum(double NumberA , double NumberB) {
		return NumberA+NumberB;
	}
	public static double subtract(double NumberA , double NumberB) {
		return NumberA-NumberB;
	}
	public static double divide(double NumberA , double NumberB) {
		if(NumberB!=0) {
			return NumberA/NumberB;
		}
		else
			return 999999999;
	}
	public static double multiply(double NumberA , double NumberB) {
		return NumberA*NumberB;
	}

}
