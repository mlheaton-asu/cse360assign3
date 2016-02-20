package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator button = new Calculator();
		assertNotNull(button);
	}

	@Test
	public void testGetTotal() {
		Calculator tool = new Calculator();
		tool.add(5);
		assertEquals(5, tool.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator tool = new Calculator();
		tool.add(6);
		tool.add(5);
		assertEquals(11, tool.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator tool = new Calculator();
		tool.add(16);
		tool.subtract(16);
		assertEquals(0, tool.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator tool = new Calculator();
		tool.add(5);
		tool.multiply(5);
		assertEquals(25, tool.getTotal());
		
		tool.multiply(4);
		assertEquals(100, tool.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator tool = new Calculator();
		tool.divide(0);
		assertEquals(0, tool.getTotal());
		
		tool.add(16);
		tool.divide(4);
		assertEquals(4, tool.getTotal());
		
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}
