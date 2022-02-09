package factorials;

public class Factorials {
	
	public String calc(int x) {
		
		int i = 1;
		int hold = x;
		
		while(hold % i == 0) {
			if(hold / i == 1) {
				return i + "!";
			}
			hold = hold / i;
			i++;
		}
		return "NONE";
	}
	
	
}
