package by.academy.homework4;

import java.util.Arrays;
import java.util.Objects;

public class Task3<T> {

	private T[] arr;
	private int size;

	public Task3(int size) {
		this.size = size;
		this.arr = (T[]) arr[size];
	}

	public Task3() {
		super();
		this.arr = (T[]) new Object[16];
	}

	public T getFirst() {
		return (T) arr[0];
	}

	public void add(T obj) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = obj;
			} else {
				int newLength = (int) (arr.length == 0 ? 1 : arr.length * 1.5);
				T[] newArr = Arrays.copyOf(arr, newLength);
				newArr[arr.length] = obj;
				arr = newArr;

			}
		}
	}

	public T getByIndex(int i) {
		return (T) arr[i];
	}

	public T getLast() {

		return (T) arr[arr.length - 1]; 
	}

	public int showCapacity() {
		return arr.length;
	}

	public void remove(int i) {
		arr[i] = null;
	}

	public void remove(T obj) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == obj) {
				arr[i] = null;
			} else {
				System.out.println("Нет такого значения");
			}
		}
	}
	// 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
	// ??

	public int findIndex() {
		int i = 0;
		while ((i < arr.length) && (arr[i] != null)) {
			i++;
		}
		return i;

	}

	@Override
	public String toString() {
		return "Task3 [arr=" + Arrays.toString(arr) + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(arr);
		result = prime * result + Objects.hash(size);
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
		Task3 other = (Task3) obj;
		return Arrays.deepEquals(arr, other.arr) && size == other.size;
	}

	
	
}
