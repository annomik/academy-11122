package by.academy.deal;

public class Cheese extends Product {
   
	private int fatContent;
	private String country;
	
	public double discount() {
		 if (this.fatContent > 40) {
			 return 0.5;
		 } else
		 	{
			 return 1;
		 	}
	 }
	
	public double calcPrice(double price, int quantity ) {
		return (price*quantity);
	}
	
	public Cheese(int fatContent, String country) {
		super();
		this.fatContent = fatContent;
		this.country = country;
	}
	
	public Cheese(String name, double price, int quantity, int fatContent, String country) {
		super(name, price, quantity);
		this.fatContent = fatContent;
		this.country = country;
		}
	
	public Cheese(String name, double price, int quantity) {
		super(name, price, quantity);
		}

	public Cheese() {
		super();
		}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [fatContent=");
		builder.append(fatContent);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
	
	
	public int getFatContent() {
		return fatContent;
	}

	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + fatContent;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cheese other = (Cheese) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (fatContent != other.fatContent)
			return false;
		return true;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}