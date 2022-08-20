package by.academy.classwork.lesson19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import by.academy.classwork.lesson13.User;


public class SerializableDemo {

	public static void main(String[] args) throws IOException {

		 User user = new User("SuperAdmin", "qwerty");
	//	User user = new User();

		File myDir = new File("by/academy/classwork/lesson19");
		if (!myDir.exists()) {
			myDir.mkdirs();
		}
		File file = new File(myDir, "deal.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject("Product");
			oos.writeInt(3);
			oos.writeObject(user);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(file));
				ObjectInputStream isu = new ObjectInputStream(br)) {
			String str = (String) isu.readObject();
			Integer i = isu.readInt();
			User user1 = (User) isu.readObject();
			System.out.println(str);
			System.out.println(i);
			System.out.println(user1);

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}