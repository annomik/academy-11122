package by.academy.classwork.lesson11;

public class Main {
//	1.	а) Определить интерфейс Printable, содержащий метод void print().
//	б) Определить класс Book, реализующий интерфейс Printable.
//	в) Определить класс Magazine, реализующий интерфейс Printable.
//	г) Создать массив типа Printable, который будет содержать книги и журналы.
//	д) В цикле пройти по массиву и вызвать метод print() для каждого объекта. 
//	е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.  Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.
	
	public static void main(String[] args) {

		// Book book1 = new Book();
		Printable[] bookMagazine = new Printable[4];
		bookMagazine[0] = new Book("ABC");
		bookMagazine[1] = new Magazine("GEO");
		bookMagazine[2] = new Book("Booook2");
		bookMagazine[3] = new Magazine("Vogue");

		for (var e : bookMagazine) {
			e.print();
		}

		Magazine.printMagazines(bookMagazine);
		System.out.println("-----------");
		Book.printBooks(bookMagazine);
	}

}