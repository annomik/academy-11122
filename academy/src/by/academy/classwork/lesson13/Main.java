package by.academy.classwork.lesson13;

import by.academy.classwork.lesson13.User.Query;

public class Main {

	public static void main(String[] args) {
//	Generic(<Integer, String, Cat>) obj = new Generic<>(90, "Hello", new Cat );


//  1.	Создать класс User, содержащий private переменные login, password. Создать внутренний класс Query в классе User. 
//  Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
 // Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog(). 
 // В методе main(): создать экземпляр класса User и вызвать метод createQuery(); создать экземпляр класса Query и вызвать метод printToLog() 
 // используя конструкцию user.new Query(); создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query(); 
  
	
		User user = new User();
		user.createQuery();
		
		Query query2 = user.new Query();
		query2.printToLog();
		
		Query query3 = new User().new Query();
		query3.printToLog();
		
	}

}