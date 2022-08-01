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
	
//	9.	Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы - sum, multiply, divide, subtraction. 
//	Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.	
//	
	
}