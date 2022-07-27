package by.academy.classwork.lesson11;

public class Drum implements Instrument {

	String size;
	String name = "Drum";

	
	@Override
	public void play() {
		System.out.println("Играет "+ KEY + name +". Размер: " + size);
	}
	
	public Drum(String size) {
		super();
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
