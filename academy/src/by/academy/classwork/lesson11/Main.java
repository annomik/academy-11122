package by.academy.classwork.lesson11;

public class Main {

	public static void main(String[] args) {

		// Book book1 = new Book();
		Printable[] bookMagazine = new Printable[4];
		bookMagazine[0] = new Book("AB");
		bookMagazine[1] = new Magazine("Second");
		bookMagazine[2] = new Book("Booook");
		bookMagazine[3] = new Magazine("alala");

		for (var e : bookMagazine) {
			e.print();
		}

		Magazine.printMagazines(bookMagazine);
	}

}