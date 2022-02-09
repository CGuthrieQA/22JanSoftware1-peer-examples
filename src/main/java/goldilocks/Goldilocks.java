package goldilocks;

import java.util.ArrayList;
import java.util.List;

public class Goldilocks {
	
	public List<Integer> eat(int weight, int maxTemp, Integer[] chairs, Integer[] temps) {
		List<Integer> canSitHere = new ArrayList<>();
		
		for (int i = 0 ; i < temps.length; i++) {
			if (temps[i] <= maxTemp && weight <= chairs[i]) {
				canSitHere.add(i);
			}
		}
		return canSitHere;
	}
}
