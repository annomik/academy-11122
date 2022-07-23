package by.academy.deal;

import java.util.Objects;

public class User {

	private String name;
	private double money;
	private String dateOfBirth;
	private String phone;
	private String email;
	
	public User() {
		super();
	}
	
	public User (String name, double money) {
		this.name = name;
		this.money = money;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public User(String name, double money, String dateOfBirth, String phone, String email) {
		super();
		this.name = name;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
	       return name;
	}
		
		
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", money=" + money + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, email, money, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& Double.doubleToLongBits(money) == Double.doubleToLongBits(other.money)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

		
}
