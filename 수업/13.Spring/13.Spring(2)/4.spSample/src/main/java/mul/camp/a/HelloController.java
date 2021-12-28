package mul.camp.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mul.camp.a.dto.HumanDto;

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
	
	@RequestMapping("world")
	public String world(String job) {
		logger.info("HelloController world()");
		
		System.out.println("job = " + job);
		
		return "world";
	}
	/*
	@RequestMapping(value = "account", method = RequestMethod.POST)
	public String account(String name, int age) {
		logger.info("HelloController account()");
		
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		
		return "hello";
	}
	*/	
	
	@RequestMapping(value = "account", method = RequestMethod.POST)
	public String account(HumanDto human) {
		logger.info("HelloController account()");
		
		System.out.println(human.toString());
		
		return "hello";
	}
}










