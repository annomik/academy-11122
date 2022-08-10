package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
// Задача 4.	Создать список оценок учеников с помощью ArrayList, 
// заполнить случайными	оценками. 
// Найти самую высокую оценку с использованием итератора

		List<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 10 + 1);
			arrList.add(i, new Integer(a));
		}

		System.out.println(arrList);

		Iterator<Integer> iterator = arrList.iterator();

		int max = 0;
		while (iterator.hasNext()) {
			Integer element = iterator.next();

			if (element > max) {
				max = element;
			}
		}
		System.out.println("Max element: " + max);
	}

}
