package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	// Ввести n слов с консоли.
	//Найти слово, в котором число различных символов минимально. 
	//Если таких слов несколько, найти первое из них.
		
		int shortest = 0;
		int counter = 256;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of words:");
		int n = sc.nextInt();
	
		System.out.println("Enter "+ n+" words:");
		sc.nextLine();
		String[] words = sc.nextLine().split(" ");
							
		for (int c = 0; c < words.length; c++) { 
			
			StringBuilder word = new StringBuilder(words[c]);
			
			for (int i = 0; i < word.length(); i++) {
				for (int j = i+1; j < word.length(); j++) {
					if (word.charAt(i) == word.charAt(j)) {
						word.deleteCharAt(j);
						j--;
					}
					
					}
			}
			
			if (word.length() < counter)	{
				counter = word.length();
				shortest = c;
				}			
		}
					
		System.out.println("First the shortest: "+words[shortest]);
			
		sc.close();
	}

}