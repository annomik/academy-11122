package by.academy.homework7.task3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestDemo {

	@Test
	public void testSum() {
		Assert.assertEquals(4, Calculator.sum(2, 2));
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(9.0, Calculator.multiply(3.0, 3.0), 1.0);

	}

	@Test
	public void testDivide() {
		Assert.assertEquals(5, Calculator.divide(10, 2));

	}

	@Test
	public void testSubtract() {
		Assert.assertEquals(8, Calculator.subtract(10, 2));

	}

	@Test(timeout = 100)
	public void testTimeout() {
		int i = 0;
		while (i < 999) {
			System.out.println("alalall");
			i++;
		}

	}

	@Test (expected = ArithmeticException.class)
	public void testExpected() {
		int i = 1 / 0;
	}
	
	@Test 
	@Ignore
	public void testFail() {
		Assert.fail("ahahha");
	}
	

}