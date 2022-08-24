package by.academy.homework6;

import java.io.*;

//Создать новый файл result.txt. Программно считать файл с текстом, удалить все пробелы
//и записать полученный текст в result.txt.

public class Task2 {

	public static void main(String[] args) throws IOException {

		File myDir = new File("src/by/academy/homework6");
		if (!myDir.exists()) {
			myDir.mkdirs();
		}
				
		File outputFile = new File(myDir, "result.txt");
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		try (FileInputStream fileIn = new FileInputStream(new File("e:/Git repository/academy-11122/academy/src/by/academy/homework6/Task2.txt"));
				FileOutputStream fileOut = new FileOutputStream(outputFile);) {

			int x;
			while ((x = fileIn.read()) != -1) {
				if ((char) x != ' ') {
					fileOut.write(x);
				}
			}
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}
}
