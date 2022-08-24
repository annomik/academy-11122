package by.academy.homework6;

import java.io.*;
import java.util.*;

public class Task3Main {

	public static void main(String[] args) throws IOException {

		ArrayList<User> arrayUsers = new ArrayList<>();

		arrayUsers.add(new User("Иван", "Иванов", 22));
		arrayUsers.add(new User("Ольга", "Иванова", 20));
		arrayUsers.add(new User("Светлана", "Петрова", 42));
		arrayUsers.add(new User("Петр", "Петров", 52));
		arrayUsers.add(new User("Лев", "Толстой", 32));
		arrayUsers.add(new User("Оскар", "Уальд", 22));
		arrayUsers.add(new User("Александр", "Пушкин", 92));
		arrayUsers.add(new User("Джек", "Лондон", 18));
		arrayUsers.add(new User("Федор", "Достоевский", 33));
		arrayUsers.add(new User("Борис", "Борисов", 83));

		File myDir = new File("src/by/academy/homework6/users");
		if (!myDir.exists()) {
			myDir.mkdirs();
		}

		for (User element : arrayUsers) {

			File file = new File(myDir, element.getName() + "_" + element.getLastName() + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
					ObjectOutputStream oos = new ObjectOutputStream(bos)) {
				oos.writeObject(element.getName().toString());
				oos.writeObject(element.getLastName().toString());
				oos.writeInt(element.getAge());

			} catch (IOException e) {
				System.err.println(e.getMessage());
			}

		}
	}
}
