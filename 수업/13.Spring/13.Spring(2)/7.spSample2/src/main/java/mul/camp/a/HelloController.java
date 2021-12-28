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

import mul.camp.a.dto.HumanDto;

@Controller
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value = "hello.do", method = RequestMethod.GET )
	public String hello(Model model) {
		logger.info("HelloController hello() " + new Date());
		
		String name = "홍길동";
		model.addAttribute("_name", name);	// 짐싸!
		
		return "hello";	// 이동해!
	}
	
	@RequestMapping(value = "home.do", method = RequestMethod.GET )
	public String home(Model model) {
		logger.info("HelloController home() " + new Date());
		/*
		String job = "gamer";
		int age = 18;
		
		model.addAttribute("job", job);
		model.addAttribute("age", age);
		*/
		
		HumanDto dto = new HumanDto("gamer", 18);
		model.addAttribute("human", dto);	// 짐싸!
		
		return "home";
	}
	
	@RequestMapping(value = "world.do", method = RequestMethod.GET )
	public String world(Model model) {
		logger.info("HelloController home() " + new Date());
		
		List<HumanDto> list = new ArrayList<HumanDto>();
		list.add(new HumanDto("프로그래머", 25));
		list.add(new HumanDto("게이머", 18));
		list.add(new HumanDto("시스템엔지니어", 35));
		
		model.addAttribute("list", list);
		
		return "world";		
	}
	
}














