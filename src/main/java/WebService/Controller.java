package WebService;

import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/param")
	public Resource getParam(@RequestParam(value="content", defaultValue = "HelloWorld") String content) {
		
		Random rand = new Random();
		System.out.println("called");
		return new Resource(rand.nextInt(10),String.format("Hello, %s",content));
		
	}
	

}
