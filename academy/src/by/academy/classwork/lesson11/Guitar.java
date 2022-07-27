package by.academy.classwork.lesson11;

public class Guitar implements Instrument {

	int numberOfStrings;
	String name =  "Guitar";

	@Override
	public void play() {
		System.out.println("Играет "+ KEY + name +" с количеством струн " + numberOfStrings);
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	public Guitar() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Guitar(int numberOfStrings) {
		super();
		this.numberOfStrings = numberOfStrings;
	}

	
	@Override
	public String toString() {
		return "Guitar [numberOfStrings=" + numberOfStrings + ", getNumberOfStrings()=" + getNumberOfStrings()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
