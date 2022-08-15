package by.academy.homework5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		List<String> list1 = List.of("a", "b", "c", "d", "a", "d", "e", "f", "c", "a");
		getCollectionWithoutDuplicates(list1);

//		List<Integer> arrayList = new ArrayList<>();
//		addList(arrayList);
//		chooseElement(arrayList);
//		System.out.println("-----------------------------------------------");
//		
//		List<Integer> linkedList = new LinkedList<>();
//		addList(linkedList);
//		chooseElement(linkedList);

		
//		Задача 6. Попробовать добавить в массив int на 8 элементов 10 чисел. Обернуть в try/catch, словить ArrayIndexOutOfBoundsException
//		и вывести на экран сообщение: "Array is to small, expand the array".
		System.out.println("-----------------------------------------------");
		int numArray[] = new int[8];
		try {
			for (int i = 0; i < 10; i++) {
				numArray[i] = (int) Math.random()*10;
			}
		}	
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Array is to small, expand the array");
		}
	
//  Задача 5. Можно писать все в main. Не нужно создавать новых классов.
//		Имеется текст. Следует составить для него частотный словарь:
//		Создать Map<Character, Integer> для символов,
//   в который мы заносим символ и его количество.
				
		Map<Character, Integer> dictionary = new HashMap<>();
		String text = "Создать Map<Character, Integer> для символов,// в который мы заносим символ и его количество.";
		
		char[] textToArray = text.toCharArray();
		
		for (char c : textToArray) {
			int count = 1;
			if (dictionary.get(c) != null) {
				count = dictionary.get(c) + 1;
			}
			dictionary.put(c, count);
		}
	System.out.println(dictionary);
	}

//  Задача 1.Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
	public static void getCollectionWithoutDuplicates(Collection<?> collection) {
		Set<?> set1 = new HashSet<>(collection);
		System.out.print("Коллекция без дубликатов: ");
		for (Object o : set1) {
			System.out.print(o + " ");
		}
		return;
	}

//	2) Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//	Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 

	public static void addList(List<Integer> list) {
		Random random = new Random();
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i, random.nextInt(2000));
		}
	}

	public static void chooseElement(List<Integer> list) {
		Random random = new Random();
		System.out.println(LocalDateTime.now());
		for (int i = 0; i < 100_000; i++) {
			int a = random.nextInt(1000_000);
			System.out.print(list.get(a) + " ");   // "i = " + i + " "+
			if (i % 1000 == 0) {
				System.out.println("");
			}
		}
		System.out.println(LocalDateTime.now());
	}
}
