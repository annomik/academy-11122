package by.academy.homework4;

public class MainTask3 {

	public static void main(String[] args) {
		Task3<Integer> array = new Task3<>();
		
		array.add(10);
		array.add(12);
		array.add(1);
		array.add(11);
		array.add(14);
		array.add(105);
		array.add(116);

		System.out.println("Размер массива: " + array.showCapacity());
		System.out.println("First is : " + array.getFirst());
		System.out.println("Last is : " + array.getLast());
		
		System.out.println(array.getByIndex(4));
				
		array.remove(3);
		System.out.println(array);
		System.out.println("Последний заполненный элемент. Индекс: " + array.findIndex());
		
		array.removeValue(10);
							
		System.out.println(array);
	
	}

}
