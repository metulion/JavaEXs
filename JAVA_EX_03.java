package controller;

public class Calculation {
	
	
	
	public static double sum(double numberA , double numberB) {
		return numberA+numberB;
	}
	public static double subtract(double numberA , double numberB) {
		return numberA-numberB;
	}
	public static double divide(double numberA , double numberB) {
		if(numberB!=0) {
			return numberA/numberB;
		}
		else
			return 999999999;
	}
	public static double multiply(double numberA , double numberB) {
		return numberA*numberB;
	}

}
