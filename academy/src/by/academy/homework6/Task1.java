package by.academy.homework6;

import java.io.*;

public class Task1 {

	public static void main(String[] args) throws IOException {
// Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
// если введена "stop" строка тогда закончить запись в файл.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;

		File myDir = new File("src/by/academy/homework6");
		if (!myDir.exists()) {
			myDir.mkdir();
		}

		File file = new File(myDir, "Task1.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		System.out.println("Введите текст");
		System.out.println("Введите строку \"stop\", если хотите закончить запись в файл ");

		try (FileWriter fileWriter = new FileWriter(
				"e:/Git repository/academy-11122/academy/src/by/academy/homework6/Task1.txt")) {
			do {
				str = br.readLine();
				
				if (str.equals("stop")) {
					break;
				}
				str = str + "\r\n";
				fileWriter.write(str);

			} while (!str.equals("stop"));
		} catch (IOException exc) {
			System.out.println("Ошибка ввода-вывода: " + exc);
		}
	}

}
