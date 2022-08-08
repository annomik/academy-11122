package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomDate {

	public Year year;
	public Month month;

	Date1 datecheck = new Date1();

	public CustomDate() {
		super();
	}

	public CustomDate(String string) {

		Year year = new Year();
		this.year = year;

	}
	
	

	class Year {
		int year;

		public void leapYear() {
			if ((year % 4 != 0) || ((year % 100 == 0)&& (year % 400 != 0))) {
				System.out.println("Не високосный");
			} else 
				System.out.println("Високосный");
		}
	}

	class Month {

	}

	public void findDay(String dateFromConsole) {
		while (true) {

			if (datecheck.check(dateFromConsole)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate date1 = LocalDate.parse(dateFromConsole, formatter);

			//	System.out.println("День: " + date1.getDayOfWeek());
				DayOfWeek day = date1.getDayOfWeek();
				switch (day) {
				case SUNDAY:
					System.out.println("Воскресенье");
					break;
				case MONDAY:
					System.out.println("MONDAY");
					break;
				case TUESDAY:
					System.out.println("TUESDAY");
					break;
				case WEDNESDAY:
					System.out.println("WEDNESDAY");
					break;
				case THURSDAY:
					System.out.println("THURSDAY");
					break;
				case FRIDAY:
					System.out.println("FRIDAY");
					break;	
				case SATURDAY:
					System.out.println("SATURDAY");
					break;
				default:
					break;
				}

				break;
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}
		}

	}

	public enum DaysOfWeek {

		MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

		private int number;

		DaysOfWeek(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}

	}

}
