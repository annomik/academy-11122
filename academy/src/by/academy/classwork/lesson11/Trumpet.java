package by.academy.classwork.lesson11;

public class Trumpet implements Instrument {
	
	int diameter;
	String name =  "Trumpet";
	
	@Override
	public void play() {
		System.out.println("Играет "+ KEY + name +". Диаметр: " + diameter);
		  
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public Trumpet(int diameter) {
		super();
		this.diameter = diameter;
	}




	public Trumpet() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getDiameter() {
		return diameter;
	}




	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}




	@Override
	public String toString() {
		return "Trumpet [diameter=" + diameter + "]";
	}
	
	
	

}
