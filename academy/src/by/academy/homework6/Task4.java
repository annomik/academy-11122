package by.academy.homework6;

import java.io.*;
import java.util.Random;
//Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
//Считываем текст из 2-ого задания, получаем его длинну (576 символов).
//Для каждого файла генерируем рандомное число от 0 до 576, 
//достаем из текста (из 2 задания) такое-же количество символов (string.substring()) 
//и сохраняем в наш файл. Создайте файл result.txt и запишите туда список всех файлов и их размеры.

public class Task4 {

	public static void main(String[] args) throws IOException {

		File myDir = new File("src/by/academy/homework6/task4");
		if (!myDir.exists()) {
			myDir.mkdirs();
		}

		File resultFile = new File(myDir, "result.txt");
		if (!resultFile.exists()) {
			resultFile.createNewFile();
		}
		
		String listOfFiles = "";
		for (int i = 1; i < 101; i++) {
			File file = new File(myDir, i + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (BufferedReader br = new BufferedReader(
					new FileReader("e:/Git repository/academy-11122/academy/src/by/academy/homework6/Task2.txt"));
					BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/by/academy/homework6/task4/" + i + ".txt"));
					FileWriter fileWriter = new FileWriter("e:/Git repository/academy-11122/academy/src/by/academy/homework6/task4/result.txt")) {

				String str = br.readLine();

				Random random = new Random();
				int cutString = random.nextInt(str.length());				
				bufferedWriter.write(str.substring(0, cutString));
				
				listOfFiles = listOfFiles + "\r\n" + file.getName() + ", size of file is: "+ cutString + " symbol(s)";
				fileWriter.write(listOfFiles);
				
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
