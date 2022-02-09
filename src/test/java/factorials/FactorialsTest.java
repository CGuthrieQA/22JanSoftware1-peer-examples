package factorials;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialsTest {
	
	// when a function is given 120, does it return 5!
	@Test
	void factorialTest() {
		Factorials fact = new Factorials();
		String actual = fact.calc(3628800);
		String expected = "10!";
		assertEquals(expected,actual,"wrong answer");
	}

	@Test
	void notFactorialTest() {
		Factorials fact = new Factorials();
		String actual = fact.calc(150);
		String expected = "NONE";
		assertEquals(expected,actual,"wrong answer");
	}
	
}
