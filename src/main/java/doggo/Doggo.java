package doggo;

import java.util.ArrayList;
import java.util.List;

public class Doggo {
	
	public String place(int x) {
		List<String> places = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			if (i == 11 || i == 12 || i == 13) {
				places.add(i + "th");
			} else {
				switch(i%10) {
					case 1:
						places.add(i + "st");
						break;
					case 2:
						places.add(i + "nd");
						break;
					case 3:
						places.add(i + "rd");
						break;
					default:
						places.add(i + "th");
				}
			}
		}
		
		places.remove(x-1);
		return String.join(", ", places);
		
	}
}
