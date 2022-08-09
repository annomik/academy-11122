package by.academy.classwork.lesson15;

public class LinkedListCustom<T> {
	private Node head;
	private Node tail;
	private int size = 0;
	
	public void remove(int index, T value ) {
		if (size < index || index < 0) {
			 System.out.println("Ошибка");
			 return;
		} else {
			Node node1 = new Node(value);
			int counter = 0;
			Node current = head;
			while(counter < index) {
				current = current.next;
				counter++;
			}
			Node next = current.next;		
			Node prev = current.prev;
			current.prev = null;
			current.next = null;
		}
	}
	
	
	public T get(int index) {
		Node current = head;
		int counter = 0;
		
		while (counter < index) {
			current = current.next;
			counter++;
		}
	}

	
	class Node {
		T value;
		Node next;
		Node prev;
		
		Node(T value){
			this.value = value;
			
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [value=");
			builder.append(value);
			builder.append(", next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append("]");
			return builder.toString();
		}
	}
}