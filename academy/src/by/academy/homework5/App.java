package by.academy.homework5;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
			
		List<String> list1 = List.of("a", "b", "c", "d", "a", "d", "e", "f", "c");
				
		getCollectionWithoutDuplicates(list1);

	}
	// Задача 1.Напишите метод, который на вход получает коллекцию объектов, 
	// а возвращает коллекцию уже без дубликатов.
	public static void getCollectionWithoutDuplicates(Collection<?> collection) {
		Set<?> set1 = new HashSet<>(collection);
	
		for (Object o : set1) {
			System.out.println(o);
		}
		return;
	}
}
