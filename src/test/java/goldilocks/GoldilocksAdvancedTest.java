package goldilocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GoldilocksAdvancedTest {
	@Test
	void eatTest() {
		GoldilocksAdvanced g = new GoldilocksAdvanced();
		int weight = 100;
		int maxTemp = 120;
		int minLuminosity = 70;
		Integer[] seats = {297,66,257,276,280,163,193,153,107,137,40,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
		Integer[] temps = {90,110,113,191,129,163,193,153,107,137,40,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
		Integer[] lux   = {54,78,98,12,22,12,45,65,71,87,98,45,98,10,100,12,54,98,87,32,65,97,64,31,54,65,87,98,65,21};
		List<Integer> actual = g.eat(weight, maxTemp, minLuminosity, seats, temps, lux);
		List<Integer> expected = List.of(2,8,18,21);
		assertEquals(expected, actual, "wrong chairs");
	}
}
