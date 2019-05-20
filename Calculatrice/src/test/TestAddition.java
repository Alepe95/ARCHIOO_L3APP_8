package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.MonException;
import premierCoursCalculatrice.Calculator;

public class TestAddition {

	@Test
	public void testAddition() throws MonException {
		int a = 10;
		int b = 20;
		char c = '+';
		
		assertEquals(30, Calculator.execute(a, b, c));
	}
	
}
