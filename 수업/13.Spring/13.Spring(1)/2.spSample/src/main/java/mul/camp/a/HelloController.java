package mul.camp.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// <- annotation
public class HelloController {
	
	private static Logger logger = LoggerFactory.getLogger(HelloController.class); 

	@RequestMapping("hello")	// hello <- pattern
	public String helloMethod() {
	//	System.out.println("HelloController helloMethod()");
		logger.info("HelloController helloMethod()");
		
		return "hello";		// hello.jsp로 가라!
	}
	
	@RequestMapping("home")
	public String home(String name) {
		logger.info("HelloController home()");
		
		System.out.println("name = " + name);
		
		return "home";		// home.jsp로 가라!
	}
	
	
	
}




