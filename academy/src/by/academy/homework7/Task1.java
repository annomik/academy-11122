package by.academy.homework7;

import java.util.*;
import java.util.stream.*;

public class Task1 {

	public static void main(String[] args) {

		Map<Long, String> mapOfNumbers = Stream.generate(() -> new Random().nextLong(100))
				.limit(100)
				.filter(x -> (long)(x * (Math.PI) - 20) < 100)
				.sorted()
				.skip(3)
				.peek(s -> System.out.print(s + " "))
				
				.collect(Collectors.toMap(key -> key, value -> " Number: " + value,
						(existing, replacement) -> existing));
		
		System.out.println(" ");
		System.out.println(mapOfNumbers);

	}
}
