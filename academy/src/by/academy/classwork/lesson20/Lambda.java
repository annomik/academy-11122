package by.academy.classwork.lesson20;

import java.util.function.Predicate;

public class Lambda<T> {
	public static void main(String[] args) {
	// 1. Написать лямбда выражение для интерфейса Printable, который содержит один
	// метод void print().
	
		 Printable printer = s -> System.out.println(s);
	     printer.print("Hello");
	
//	     2.	Создать лямбда выражение, которое возвращает значение true, 
//	     если строка не null, используя функциональный интерфейс Predicate.    
	     
	     Predicate<String> predict = c -> c != null;
	     System.out.println(predict.test(null));
	
	     
//	     3.	Создать лямбда выражение, которое проверяет, что строка не пуста, 
//	     используя функциональный интерфейс Predicate	 
	     
	     Predicate<String> pred = c -> !c.isEmpty();
	     System.out.println(pred.test(""));
	     
	   predict.and(pred).test(null) ;
	   System.out.println( predict.and(pred).test("ee") );
}

	public interface Printable {
		void print(String s);
	}
	
	
}