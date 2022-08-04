package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import by.academy.deal.Date;

public class MainCustomDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CustomDate customDate = new CustomDate();  
				
		
		System.out.println("Введите дату в формате dd-MM-yyyy: ");
		String dateFromConsole = sc.nextLine();
		while (true) {
			Date1 datecheck = new Date1();
			if (datecheck.check(dateFromConsole)) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate date1 = LocalDate.parse(dateFromConsole, formatter);
			} else {
				System.out.println("Некорректно введенные данные! Повторите ввод.");
			}		
				
		
		customDate.findDay(date1);
		
		sc.close();	
	}

}
