package by.academy.homework4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;


public class CustomDate {

	private Year year;
	private Month month;
	private Day day;

	Date1 datecheck = new Date1();
	CustomDate customDate = new CustomDate();  
	
	public CustomDate() {
		super();
	}

	public CustomDate(String dateFromConsole) {
		super();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	//	LocalDate date1 = LocalDate.parse(dateFromConsole, formatter);
		this.day = new Day(Integer.parseInt(dateFromConsole.substring(0, 2)));
		this.month = new Month(Integer.parseInt(dateFromConsole.substring(3, 5)));
		this.year = new Year(Integer.parseInt(dateFromConsole.substring(6)));
		

	}

	class Year {
		int year;

		public Year(int parseInt) {
			// TODO Auto-generated constructor stub
		}

		public void leapYear() {
			if ((year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))) {
				System.out.println("Не високосный");
			} else
				System.out.println("Високосный");
		}
	}

	class Month {
		int month;
		
        public Month(int month) {
        	this.month = month;
        }
	}

	class Day {
		int day;
		public Day(int day) {
        	this.day = day;
        }
		
	}
	
	public void findDay(String dateFromConsole) {
		while (true) {

			if (datecheck.check(dateFromConsole)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate date1 = LocalDate.parse(dateFromConsole, formatter);

			//	System.out.println("День: " + date1.getDayOfWeek());
				DayOfWeek day1 = date1.getDayOfWeek();
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
					break;
				}

				break;
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}
		}

	}

	public enum DaysOfWeek {

		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	}
	
	 public LocalDate dateToLocalDate() {
	        return LocalDate.of(getYear(), getMonth(), getDay());
	    }
	
	public void countDaysBetween() {
		int countDays = (int) Math.abs(ChronoUnit.DAYS.between(dateToLocalDate(), LocalDate.now()));
		
		System.out.println("Количество дней : " + countDays); 

	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}
	
	
	
	
	
	
	

}
