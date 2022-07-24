package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int age = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите сумму покупки:");

		if (sc.hasNextDouble() ) {
			sum = sc.nextDouble();	
			System.out.println("Введите возраст покупателя:");

			if (sc.hasNextInt()) {
				age = sc.nextInt();

				if (sum >= 400)
					System.out.println("Цена: "+sum*0.8+ " руб. Ваша скидка 20%");
				else 
					if (sum >= 300)
						System.out.println("Цена: "+sum*0.85+" руб. Ваша скидка 15%");
					else
						if (sum >= 200 && age>18)
							System.out.println("Цена: "+sum*0.84+" руб. Ваша скидка 16%");
						else 
							if (sum >= 200 && age<=18)
								System.out.println("Цена: "+sum*0.91+" руб. Ваша скидка 9%");
							else
								if (sum >= 100)
									System.out.println("Цена: "+sum*0.93+" руб. Ваша скидка 7%");
								else
									System.out.println("Цена: "+sum*0.95+" руб. Ваша скидка 5%");
			}
			else 
				System.out.println("Некорректные данные");
		}
		else 
			System.out.println("Некорректные данные");

		sc.close();

	}

}