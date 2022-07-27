package by.academy.classwork.lesson11;

public class Magazine implements Printable {

	private String name;

	public static void printMagazines(Printable[] bookMagazine) {

		for (Printable p : bookMagazine) {
			if (p instanceof Magazine) {
				p.print();
			}
		}
	}

	@Override
	public void print() {
		System.out.println("Magazine:  " + name);
	}

	public String getName() {
		return name;
	}

	public Magazine(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Magazine [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}