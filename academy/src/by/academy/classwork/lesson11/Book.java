package by.academy.classwork.lesson11;

public class Book implements Printable {

	private String name;

	@Override
	public void print() {
		System.out.println("Print book " + name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(String name) {
		super();
		this.name = name;
	}

}
