package Hello;

import java.util.Random;

public class PrintText {
	
	public int genRandom() {
		Random rand = new Random();
		return rand.nextInt(10);
	}
	
	public String printText() {
		
		return "Hello";
	}

}
