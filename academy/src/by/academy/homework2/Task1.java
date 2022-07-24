package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Ввести две строки с консоли.
	//	Определить, является ли одна строка перестановкой символов другой строки.
	//	Учитываем регистр. Не использовать сортировку :) 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите строку");
		String first = sc.nextLine();
		
		System.out.println("Введите строку");
		String second = sc.nextLine();
	
		if (first.length() == second.length())	{
			
			char[] firstArr = first.toCharArray();
			int[] letters = new int[256];
			
			for (char c : firstArr) {
				letters[c]++;
				}
			
			for (int i = 0; i < first.length(); i++) {
				int c = (int) second.charAt(i);
			
				if (--letters[c] < 0) {
					System.out.println("Строки - не перестановка символов");
					return;
					} 
			}
			System.out.println("Строки - перестановка символов");						
		
		}
		
		else {  System.out.println("Строки разной длины!");   }
		
		sc.close();
	}
	
}