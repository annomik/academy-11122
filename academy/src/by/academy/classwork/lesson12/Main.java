package by.academy.classwork.lesson12;

public class Main {
	public static void main(String[] args) {
				
		//Seasons season = Seasons.valueOf("AUTUMN");

		Seasons favorite = Seasons.valueOf("SUMMER");

		System.out.println("Любимая пора года: " + favorite + ", cредняя температура: " + favorite.temperature);
		System.out.println(favorite.getTemperature(favorite)); // как вариант

		Seasons[] types = Seasons.values();
		for (Seasons s : types) {
			System.out.print(s.name() + ", cредняя температура: " + s.temperature + ". " );
			s.getDescription();
			s.findSeason(s);
		}

	}
//	3.	а) Создать перечисление, содержащее названия времен года.
//	б) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем. 
//	в) Создать метод, который принимает на вход переменную созданного вами enum типа.
//	Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее Используем оператор switch.
//	г) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//	д) Добавить конструктор принимающий на вход среднюю температуру.
//	е) Создать метод getDescription, возвращающий строку “Холодное время года”. 
//	Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//	ж) В цикле распечатать все времена года, среднюю температуру и описание времени года.
//	
}
