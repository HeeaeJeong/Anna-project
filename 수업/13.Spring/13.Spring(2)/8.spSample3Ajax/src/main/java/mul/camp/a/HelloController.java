package mul.camp.a;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value = "hello.do", method = RequestMethod.GET )
	public String hello(Model model) {
		logger.info("HelloController hello() " + new Date());		
		return "hello";	
	}
	
	@RequestMapping(value = "home.do", method = RequestMethod.GET )
	public String home() {
		logger.info("HelloController home() " + new Date());		
		return "home";	
	}
	
	@ResponseBody
	@RequestMapping(value = "alias.do", method = RequestMethod.GET, 
					produces = "application/String; charset=utf-8" )
	public String alias(String alias) {
		logger.info("HelloController alias() " + new Date());
		System.out.println("alias:" + alias);
		
		if(alias.equals("라이언")) {
			return "good name";
		}
		
		return "normal name";
	}
}








