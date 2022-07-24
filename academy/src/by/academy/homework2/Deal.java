package by.academy.homework2;

import java.util.Random;
import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {

		// Напишите программу Deal.java, которая должна имитировать раздачу карт для
		// игры в покер.
		// Программа получает число n, задаваемое с консоли пользователем,
		// и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
		// Разделяйте пять карт, выданных каждому игроку, пустой строкой.

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		String[][] allCards = new String[4][13];

		String[] suit = { "Diamonds ", "Hearts ", "Clubs ", "Spades " };
		String[] card = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		System.out.println("Enter number of players from 2 to 10:");

		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			if ((n < 11) && (n > 1)) {

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 13; j++) {
						allCards[i][j] = suit[i] + card[j];
					}
				}

				int j = 0;
				while (j < n) {

					for (int i = 0; i < 5; i++) {
						String[] player = new String[5];
						int randomSuit = rand.nextInt(4);
						int randomCard = rand.nextInt(13);

						while (allCards[randomSuit][randomCard] == " ") {
							randomSuit = rand.nextInt(4);
							randomCard = rand.nextInt(13);

						}

						player[i] = allCards[randomSuit][randomCard];
						allCards[randomSuit][randomCard] = " ";

						System.out.print(player[i] + " | ");

					}
					System.out.println("");
					System.out.println("");
					j++;
				}
			} else
				System.out.println("Incorrect value!");
		} else
			System.out.println("Incorrect value!");

		sc.close();
	}

}