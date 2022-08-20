package by.academy.homework5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Iterator2<T> implements Iterator<T> {
//	Задача 3. Написать итератор по двумерному массиву.
//	(Отдельный класс. Наследуемся от Iterator<T>). Протестировать в main.

	private T[][] arr2;
	private int index;
	private int jndex;

	public Iterator2() {
		super();
	}

	public Iterator2(T[][] arr2) {
		super();
		this.arr2 = arr2;
	}

	@Override
	public boolean hasNext() {
		if (arr2 == null || arr2.length <= index || arr2[index].length <= jndex) {
			return false;
		}

		return arr2[index][jndex] != null;
	}

	@Override
	public T next() {
		T array = arr2[index][jndex++];

		if (jndex == arr2[index].length) {
			index++;
			jndex = 0;
		}
		return (T) array;
	}

	@Override
	public String toString() {
		return "Iterator2 [arr2=" + Arrays.toString(arr2) + ", index=" + index + ", jndex=" + jndex + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(arr2);
		result = prime * result + Objects.hash(index, jndex);
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
		Iterator2 other = (Iterator2) obj;
		return Arrays.deepEquals(arr2, other.arr2) && index == other.index && jndex == other.jndex;
	}

}
