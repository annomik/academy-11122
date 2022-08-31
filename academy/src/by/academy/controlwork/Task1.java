package by.academy.controlwork;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	// Реализуйте метод для выполнения простейшего сжатия строк с использованием счетчика повторяющихся символов. 
	//	Например, строка ааbсссссааа превращается в а2b1с5а3. 
	//	Если сжатая строка не становится короче исходной,
	//	то метод возвращает исходную строку. Предполагается, что строка состоит
	//	только из букв верхнего и нижнего регистра (a-z).

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку: ");
		
		String str = sc.nextLine();			
		
		StringBuffer newStr = new StringBuffer();
		
		char lastLetter = str.charAt(0);
		
		int count = 1;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == lastLetter) {
				count++;						
			}else {
				newStr.append(lastLetter).append(count);			
				lastLetter = str.charAt(i);
				count = 1;
			}
		}
		
		newStr.append(lastLetter).append(count);
	
		String resultStr = newStr.toString();
		
		if (str.length() <= resultStr.length()  ) {
			System.out.println(str);
		}else {
			System.out.println(resultStr);
		}
		
		sc.close();
	}

}
