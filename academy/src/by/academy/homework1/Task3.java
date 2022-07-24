package by.academy.homework1;

import java.util.Scanner;


public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите число от 1 до 10:");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
			
			 if (number > 0	&& number < 11)	{	 
				 
				 for (int n=1;n <= 10; n++) {
					 System.out.println(number+" * "+ n +" = "+ number*n);
				 		}	
			 		}
			 else System.out.println("Incorrect value");
			}
		else System.out.println("Incorrect value");
						
		sc.close();
	}

}