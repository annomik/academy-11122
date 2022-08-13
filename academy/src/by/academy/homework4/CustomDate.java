package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CustomDate {

	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String dateFromConsole) {
		super();

		this.day = new Day(Integer.parseInt(dateFromConsole.substring(0, 2)));
		this.month = new Month(Integer.parseInt(dateFromConsole.substring(3, 5)));
		this.year = new Year(Integer.parseInt(dateFromConsole.substring(6)));

	}

	class Year {
		private int year;

		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {

			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Year [year=" + year + "]";
		}

	}

	public void leapYear() {
		if ((year.getYear() % 4 != 0) || ((year.getYear() % 100 == 0) && (year.getYear() % 400 != 0))) {
			System.out.println("Не високосный");
		} else
			System.out.println("Високосный");
	}

	
	class Month {
		private int month;

		public Month(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		@Override
		public String toString() {
			return "Month [month=" + month + "]";
		}

	}

	class Day {
		private int day;

		public Day(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		@Override
		public String toString() {
			return "Day [day=" + day + "]";
		}

	}

	public void findDay(LocalDate date) {

		DayOfWeek day1 = date.getDayOfWeek();

		switch (day1) {
		case SUNDAY:
			System.out.println("SUNDAY");
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
			System.out.println("Некорректно введенные данные!");
			break;
		}

	}

	public enum DaysOfWeek {

		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	}

	public LocalDate dateToLocalDate() {
		return LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
	}
 
	public void countDaysBetween() {
	
		long countDays = (long) (ChronoUnit.DAYS.between( dateToLocalDate(), LocalDate.now() ));
		System.out.println(dateToLocalDate());
		System.out.println("Прошло дней до сегодняшнего дня: " + countDays);
		
	}

}
