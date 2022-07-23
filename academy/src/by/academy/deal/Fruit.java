package by.academy.deal;

import java.util.Objects;

public class Fruit extends Product  {

	private String growingCountry;
	private boolean ripeness;
	
	
	public double discount() {
		 if (this.ripeness = false) {
			 return 0.9;
		 } else
		 	{
			 return 1;
		 	}
	 }
	
	public Fruit()  {
		super();
	}

	
	public Fruit(String name, double price, int quantity) {
		super(name, price, quantity);
		}

	
	public Fruit(String name, double price, int quantity, String growingCountry, boolean ripeness) {
		super(name, price, quantity);
		this.growingCountry = growingCountry;
		this.ripeness = ripeness;
	}


	public String getGrowingCountry() {
		return growingCountry;
	}


	public void setGrowingCountry(String growingCountry) {
		this.growingCountry = growingCountry;
	}


	public boolean isRipeness() {
		return ripeness;
	}

	public void setRipeness(boolean ripeness) {
		this.ripeness = ripeness;
	}


	@Override
	public String toString() {
		return "Fruit [growingCountry=" + growingCountry + ", ripeness=" + ripeness + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(growingCountry, ripeness);
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
		Fruit other = (Fruit) obj;
		return Objects.equals(growingCountry, other.growingCountry) && ripeness == other.ripeness;
	}
	
}
