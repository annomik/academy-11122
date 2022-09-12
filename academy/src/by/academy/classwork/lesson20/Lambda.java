package by.academy.classwork.lesson20;

import java.util.Random;
import java.util.function.*;
import java.util.function.Predicate;

public class Lambda<T> {
	public static void main(String[] args) {
	// 1. Написать лямбда выражение для интерфейса Printable, который содержит один
	// метод void print().

		Printable printer = s -> System.out.println(s);
		printer.print("Hello");

//	 2.	Создать лямбда выражение, которое возвращает значение true, 
//	 если строка не null, используя функциональный интерфейс Predicate.    

		Predicate<String> predict = c -> c != null;
		System.out.println("строка не null - " + predict.test(null));

//	  3.Создать лямбда выражение, которое проверяет, что строка не пуста, 
//	  используя функциональный интерфейс Predicate	 

		Predicate<String> pred = c -> !c.isEmpty();
		System.out.println(pred.test(""));

//	  4.Написать программу проверяющую, что строка не null и не пуста,
//	  используя метод and() функционального интерфейса Predicate	     

		predict.and(pred).test(null);
		System.out.println(predict.and(pred).test("ee"));
	
//	5.	Написать программу, которая проверяет, 
//	что строка начинается буквой “J”или “N” и заканчивается “A”. 
//	Используем функциональный интерфейс Predicate.
			
		System.out.println("Task 5: ");
		Predicate<String> letterJ = s -> s.startsWith("J");
		Predicate<String> letterN = s -> s.startsWith("N");
		Predicate<String> endsLetterA = s -> s.endsWith("A");
		
		System.out.println((letterJ.or(letterN)).and(endsLetterA).test("fssA"));
		System.out.println((letterJ.or(letterN)).and(endsLetterA).test("JssA"));
		
//	6.	Написать лямбда выражение, которое принимает на вход объект типа HeavyBox 
//	и выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с весом n” 
//	Используем функциональный интерфейс Consumer и метод по умолчанию andThen.	
		
		HeavyBox heavyBox = new HeavyBox(5, 20, 30);		
		HeavyBox reallyHeavyBox = new HeavyBox(100, 20, 30);
		Consumer <HeavyBox> consumer1 = weight -> System.out.println("Отгрузили ящик с весом "+ reallyHeavyBox.getWeight());
		Consumer <HeavyBox> consumer2 = weight -> System.out.println("Отправляем ящик с весом " + heavyBox.getWeight());
				
		consumer1.andThen(consumer2).accept(reallyHeavyBox);	
		
	//	7.	Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”, 
	//	“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.	
		
		Function <Integer, String> func = n -> {
			
			Integer i = n.compareTo(0);
			switch (i) {
			case -1 : 
				return "Отрицательное число";
			case 1 :
				return "Положительное число";
			case 0 :
				return "Ноль";
			}
			
			return  "Incorrect value";				
			
		};
		
		System.out.println(func.apply(0));
		System.out.println(func.apply(-20));
		System.out.println(func.apply(Integer.MAX_VALUE));

// 8.Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
//	Используем функциональный интерфейс Supplier.			
				
		Supplier <Integer> supp1 = () -> (int) (Math.random()*10);
		System.out.println(supp1.get());
		System.out.println(supp1.get());
		System.out.println(supp1.get());
		
		
//9.Переделать класс использующий Printable используя ссылку на статический метод.		
		
		Printable printable1 = System.out::println;
		printable1.print("Hello again!");		
		
	}
	
	public interface Printable {
		void print(String s);
	}

}