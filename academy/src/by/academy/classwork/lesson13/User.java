package by.academy.classwork.lesson13;

public class User {
	

		private String login = "Bob";
		private String password = "1234";
		
		   /// статические и локальные классы
		
		
			static public class Query {
				
				public  // конструктор
				
				User user = new User();  // - так нельзя!
				public void	printToLog() {
					
					System.out.println("User with login " + user.getLogin() + " and password " + user.password+ " create query" );
				}
			
			}
			
			public void createQuery() {	
				Query query = new Query();
				query.printToLog();
			}
		
			
		public String getLogin() {
				return login;
			}


			public void setLogin(String login) {
				this.login = login;
			}

			public String getPassword() {
				return password;
			}




			public void setPassword(String password) {
				this.password = password;
			}


		public User() {
				super();
				// TODO Auto-generated constructor stub
			}

		public User(String login, String password) {
			super();
			this.login = login;
			this.password = password;
		}
	}