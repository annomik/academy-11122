package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Task0 {
	
	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		
		// write code here
	
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (Math.abs(arr[i]-arr[j]) == k) {
					pairsCount++;
					}
				}	
		}			
		return pairsCount;
		}
	
		private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		}

		private static final Scanner scanner = new Scanner(System.in);

		public static void main(String[] args) throws IOException {

			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]); //размер массива

			int k = Integer.parseInt(nk[1]);
			
			System.out.println("Enter an array of numbers:");

			int[] arr = new int[n];

			String[] arrItems = scanner.nextLine().split(" ");

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(arrItems[i]);
				System.out.print(arr[i]+ " ");
			}

			int result = pairs(k, arr);
			System.out.println("Result: "+result+" pairs");

			scanner.close();
		}

		
		
	}


