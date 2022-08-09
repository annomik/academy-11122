package by.academy.homework4;

public class MainTask3 {

	public static void main(String[] args) {
		Task3<Integer> array = new Task3<>();
		
		array.add(55);
		array.add(12);
		array.add(1);
		array.add(11);
		array.add(14);

		System.out.println(array.showCapacity());
		System.out.println(array.getFirst());
		
		System.out.println(array.getByIndex(4));
		
		System.out.println(array.findIndex());
		
		array.remove(1);
	}

}
