package mul.camp.a;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mul.camp.a.dto.HumanDto;

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
	
	@ResponseBody
	@RequestMapping(value = "getlist.do", method = RequestMethod.GET)
	public List<HumanDto> getlist(String msg){
		logger.info("HelloController getlist() " + new Date());
		System.out.println("msg:" + msg);
		
		List<HumanDto> list = new ArrayList<>();
		list.add(new HumanDto("gammer", 18));
		list.add(new HumanDto("programmer", 24));
		list.add(new HumanDto("baseballman", 27));
		
		return list;		
	}
	
	
}








