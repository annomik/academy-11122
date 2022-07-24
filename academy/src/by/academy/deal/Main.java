package by.academy.deal;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		User seller = new User("Bob", 500);
		User buyer = new User("Nick", 500);

		Cheese feta = new Cheese("Фета", 10, 1, 35, "Belarus");
		Cheese parmezan = new Cheese("Пармезан", 14, 1, 50, "Italy");
		Cheese suluguni = new Cheese("Сулугуни", 9, 1, 30, "Gergia");

		Wine redWine = new Wine("Красное вино", 160, 1, 5, "red");
		Wine roseWine = new Wine("Розовое вино", 90, 1, 2, "rose");
		Wine whiteWine = new Wine("Белое вино", 220, 1, 7, "white");

		Fruit banana = new Fruit("Банан", 5, 1, "Пакистан", true);
		Fruit avocado = new Fruit("Авокадо", 12, 1, "Перу", false);
		Fruit orange = new Fruit("Апельсин", 7, 1, "Италия", true);

//	System.out.println("Скидка на красное: "+redWine.discount() ) ;
//	System.out.println("Скидка на розовое: "+roseWine.discount() ) ;
//	System.out.println(suluguni.calcPrice()); 

		Scanner sc = new Scanner(System.in);

		Deal deal = new Deal();

		Date datecheck = new Date();

		BelarusPhoneValidator numcheck = new BelarusPhoneValidator();
		EmailValidator emailcheck = new EmailValidator();

		while (true) {
			System.out.println(" Приветствуем в нашем магазине!\n Введите свой телефон в формате +375ХХХХХХХХХ:");
			String num = sc.nextLine();
			if (numcheck.isValid(num)) {
				buyer.setPhone(num);
				break;
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}
		}

		while (true) {
			System.out.println("Введите Ваш email: ");
			String num = sc.nextLine();
			if (emailcheck.isValid(num)) {
				buyer.setEmail(num);
				break;
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}
		}

		while (true) {
			System.out.println("Введите Вашу дату рождения: ");
			String num = sc.nextLine();
			if (datecheck.test(num)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				buyer.setDateOfBirth(num);
				LocalDate birth = LocalDate.parse(num, formatter);
				System.out.println("День: " + birth.getDayOfMonth());
				System.out.println("Месяц: " + birth.getMonth());
				System.out.println("День: " + birth.getYear());
				break;
			}
			if (datecheck.test1(num)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				buyer.setDateOfBirth(num);
				LocalDate birth = LocalDate.parse(num, formatter);
				System.out.println("День: " + birth.getDayOfMonth());
				System.out.println("Месяц: " + birth.getMonth());
				System.out.println("День: " + birth.getYear());
				break;
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}
		}

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		int number = -1;
		while (number != 0) {
			System.out.println("Выберите сыр: 1 - сыр Фета; 2 - сыр Пармезан; 3 - сыр Сулугуни.");
			System.out.println("Выберите вино: 4 - Красное вино; 5 -Розовое вино; 6 - Белое вино.");
			System.out.println("Выберите фрукты: 7 - Банан; 8 - Авокадо; 9 - Апельсин."
					+ "	\n ---Введите 0, если хотите завершить покупки---");

			if (sc.hasNextInt()) {
				number = sc.nextInt();

				switch (number) {
				case 0: {
					break;
				}
				case 1: {
					deal.addProduct(feta);
					break;
				}
				case 2: {
					deal.addProduct(parmezan);
					break;
				}
				case 3: {
					deal.addProduct(suluguni);
					break;
				}
				case 4: {
					deal.addProduct(redWine);
					break;
				}
				case 5: {
					deal.addProduct(roseWine);
					break;
				}
				case 6: {
					deal.addProduct(whiteWine);
					break;
				}
				case 7: {
					deal.addProduct(banana);
					break;
				}
				case 8: {
					deal.addProduct(avocado);
					break;
				}
				case 9: {
					deal.addProduct(orange);
					break;
				}
				default:
					System.out.println("Некорректно введенные данные!");
				}

			} else {
				System.out.println("-- Это не число --");
				break;
			}
		}

		deal.printBasket(deal);
		
		System.out.println("Нажмите 0 - чтобы отменить заказ.");
		System.out.println("Нажмите 1 - чтобы оплатить заказ.");
		System.out.println("Нажмите 2 - чтобы удалить товар из заказа.");
		
		if (sc.hasNextInt()) {
			number = sc.nextInt();
			switch (number) {
			case 0:
				System.out.println("Заказ отменен.");
				break;
			case 1:
				deal.BillPrint(deal);
				break;
			case 2:
				System.out.println("Введите позицию товара, который нужно удалить:");
				int m = sc.nextInt();
				int index = m-1;
				deal.removeProduct(index);
				break;	
			default:
				System.out.println("Некорректно введенные данные!");
			}
		} else {
			System.out.println("Некорректно введенные данные!");
		}

		deal.BillPrint(deal);
		
		
		sc.close();

	}
}
