package by.academy.classwork.lesson13;

public class Calc {
	
	
	public static <N extends Number, M extends Number > double  sum (N number1, M number2) {
		
		return number1.doubleValue() + number2.doubleValue();
	}

	public static <N extends Number, M extends Number > double  multiply (N number1, M number2) {
		
		return number1.doubleValue() * number2.doubleValue();
	}
	
	public static <N extends Number, M extends Number > double  divide (N number1, M number2) {
		
		return number1.doubleValue() / number2.doubleValue();
	}
	public static <N extends Number, M extends Number > double  subtraction (N number1, M number2) {
		
		return number1.doubleValue() - number2.doubleValue();
	}
	
}