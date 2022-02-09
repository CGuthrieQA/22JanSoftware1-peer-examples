package goldilocks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GoldilocksTest {
	@Test
	void eatTest() {
		Goldilocks g = new Goldilocks();
		int weight = 100;
		int maxTemp = 120;
		Integer[] seats = {297,66,257,276,280,163,193,153,107,137,40,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
		Integer[] temps = {90,110,113,191,129,163,193,153,107,137,40,127,146,197,59,124,59,54,119,121,189,108,21,18,90,52,129,181,123,132};
		List<Integer> actual = g.eat(weight, maxTemp, seats, temps);
		List<Integer> expected = List.of(0,2,8,18,21);
		assertEquals(expected, actual, "wrong chairs");
	}
}
