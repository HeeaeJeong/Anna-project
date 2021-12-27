package mul.camp.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// <- annotation
public class HelloController {

	@RequestMapping("hello")	// hello <- pattern
	public String helloMethod() {
		System.out.println("HelloController helloMethod()");
		
		return "hello";		// hello.jsp로 가라!
	}
}
