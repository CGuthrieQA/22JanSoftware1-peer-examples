package goldilocks;

import java.util.ArrayList;
import java.util.List;

public class GoldilocksAdvanced {
	
	public List<Integer> eat(int weight, int maxTemp, int minLuminosity, Integer[] chairs, Integer[] temps, Integer[] lux) {
		List<Integer> canSitHere = new ArrayList<>();
		
		for (int i = 0 ; i < temps.length; i++) {
			if (temps[i] <= maxTemp && weight <= chairs[i] && minLuminosity <= lux[i]) {
				canSitHere.add(i);
			}
		}
		return canSitHere;
	}

}
