package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainCustomDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dateFromConsole; 
		LocalDate date = null;		
						
		while (true) {
			System.out.println("Введите дату в формате dd-MM-yyyy: ");
			dateFromConsole = sc.nextLine();
			Date1 datecheck = new Date1();
			if (datecheck.check(dateFromConsole)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				date = LocalDate.parse(dateFromConsole, formatter);
				break;
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}
			sc.close();	
		}	
		CustomDate customDate = new CustomDate(dateFromConsole); 
		customDate.findDay(date);
		
		customDate.leapYear();
					
		System.out.println(customDate.dateToLocalDate());
		
		customDate.countDaysBetween();
		
	}
	
}
