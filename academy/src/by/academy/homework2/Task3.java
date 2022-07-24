package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
// ввести 2 слова, состоящие из четного числа букв. 
//Получить слово состоящее из первой половины первого слова и второй половины второго слова
     
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите слово из четного числа букв:");
		String first = sc.nextLine();
		
		System.out.println("Введите слово из четного числа букв:");
		String second = sc.nextLine();
		
		if (first.length() % 2 == 0) {
			if (second.length() % 2 ==0) {
				System.out.println(first.substring(0,first.length()/2)+second.substring(second.length()/2));
						}
			else System.out.println("Вторая строка содержит нечетное количество символов!");
			}
		else System.out.println("Первая строка содержит нечетное количество символов!");	

	sc.close();
	}

}