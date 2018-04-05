package Hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;


import org.junit.Test;

public class HelloTest {
	
	private PrintText text = new PrintText();
	
	@Test
	public void sayHello() {
		assertThat(text.printText(), containsString("Hello"));
	}
	

	
	
}
