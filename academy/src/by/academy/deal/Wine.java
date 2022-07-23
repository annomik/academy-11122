package by.academy.deal;

public class Wine extends Product {

	private int age;
	private String color;
	
	public double calcPrice(double price, int quantity ) {
		return (price*quantity);
	}
	
	 public double discount() {
		 if (this.color == "red") {
			 return 0.5;
		 } else
		 {
			 return 1;
		 }
	 }
 
	 public Wine(String name, double price, int quantity, int age, String color) {
		super(name, price, quantity);
		this.age = age;
		this.color = color;
	}

	 public Wine(int age, String color) {
			super();
			this.age = age;
			this.color = color;
		}
 	 
	public Wine() {
		super();
	}
		
	public Wine(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wine other = (Wine) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wine [age=");
		builder.append(age);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
	
}