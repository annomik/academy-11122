package by.academy.classwork.lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
//		Создайте HashMap, содержащий пары значений  - 
//		имя игрушки и объект игрушки (класс Toy).
//		Перебрать и распечатать пары значений - entrySet().
//		Перебрать и распечатать набор из имен продуктов  - keySet().
//		Перебрать и распечатать значения продуктов - values().
//		Для каждого перебора создать свой метод.

		Map<String, Toy> map1 = new HashMap<>();

		Toy t1 = new Toy("Cat", "white", 1);
		Toy t2 = new Toy("Dog", "black", 3);
		Toy t3 = new Toy("Fox", "red", 2);

		map1.put("Cat", t1);
		map1.put("Dog", t2);
		map1.put("Fox", t3);

		printKey(map1);
		printValues(map1);
		printAll(map1);
	
	}

	private static void printKey(Map<String, Toy> map1) {

		for (String key : map1.keySet()) {
			System.out.println(key);
		}

	}

	private static void printAll(Map<String, Toy> map1) {

		for (Entry<String, Toy> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

	private static void printValues(Map<String, Toy> map1) {
		for (Toy value : map1.values()) {
			System.out.println(value);
		}
	}
}