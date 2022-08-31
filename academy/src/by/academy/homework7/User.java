package by.academy.homework7;


import java.time.LocalDate;
import java.util.Objects;

public class User extends Person {
	 
	public String login ;
	private String password ;
	private String email; 
	
	public User(String firstName, String lastName, int age, LocalDate dateOfBirth, String login, String password, String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public User() {
		super();
		
	}
	
	
	public User( String login, String password,	String email) {
		
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("Login: " + getLogin());
		System.out.println("email: " + getEmail());
	}
	
	private String getPassword() {
		return password;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	protected  void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, login, password);
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
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(login, other.login)
				&& Objects.equals(password, other.password);
	}

}
