package by.academy.homework7.task3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class ParameterizeTest extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public ParameterizeTest(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters (name = "{index}: {0} divided by {1} = {2}")
	public static Iterable<Integer[]> dataForTest() {
		return Arrays.asList(new Integer[][] {
			{ 20, 10, 2 },  
			{ 1, 1, 1 }, 
			{ 20, 10, 2 }, 
			{ 30, 2, 15 },
			{ 15, 3, 5 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.divide(valueA, valueB));
	}
}