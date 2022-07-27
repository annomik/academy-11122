package by.academy.classwork.lesson11;

public class Main1 {
//	2.	Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба. 
//	Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор". 
//	Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
//		Создать массив типа Инструмент, содержащий инструменты разного типа. 
//		В цикле вызвать метод play() для каждого инструмента, который должен выводить 
//		строку "Играет такой-то инструмент c такими то характеристиками".
	
	public static void main(String[] args) {
		
		Instrument [] instruments = new Instrument[5];
		instruments[0] = new Guitar(7);
		instruments[1] = new Drum("Big");
		instruments[2] = new Drum("Middle");
		instruments[3] = new Guitar(5);
		instruments[4] = new Trumpet(50);
		
		for (var ins : instruments) {
			ins.play();
		}
		
		
	}

}
