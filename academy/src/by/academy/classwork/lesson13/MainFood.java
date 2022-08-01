package by.academy.classwork.lesson13;

public class MainFood {

	public static void main(String[] args) {
		
		Food food1 = new Food();
		food1.prepare(new Cookable() {
			@Override
			public void cook(String str) {
				System.out.println("Мы готовим суп!");
			}
		}, "hohoho");	

	}

//	5.	Создать интерфейс Cookable, содержащий метод void cook(String str). 
//	Создать класс Food, содержащий метод public void prepare(Cookable c, String str) { c.cook(str);} 
//	Создать экземпляр класса Food и вызвать его метод prepare().
//	На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable. 	
	
}
