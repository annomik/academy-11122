package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomDate {

	public Year year;
//	public Month month;

//	Date datecheck = new Date();

	public CustomDate() {
		super();

		// Year year = new Year();
		// this.year = year;

	}

	public CustomDate(String string) {

		Year year = new Year();
		this.year = year;

	}

	class Year {
		int year;

		public boolean leapYear() {
			if (year % 4 == 0) {
				return true;
			} else
				return false;
		}
	}

	class Month {

	}

	public void findDay(LocalDate date1) {
//		while (true) {
//
//			if (datecheck.check(dateFromConsole)) {
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//				LocalDate date1 = LocalDate.parse(dateFromConsole, formatter);

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
//			} else {
//				System.out.println("Некорректно введенные данные! Повторите ввод.");
//			}
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
