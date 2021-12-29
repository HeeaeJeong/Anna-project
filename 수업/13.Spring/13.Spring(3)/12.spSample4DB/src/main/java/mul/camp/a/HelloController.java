package mul.camp.a;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;

@Controller
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	MemberService service;	
	
	@RequestMapping(value = "hello.do", method = RequestMethod.GET)
	public String hello(Model model) {
		logger.info("HelloController hello() " + new Date());
		
		// DB 접근(model)
		List<MemberDto> list = service.allmember();
		model.addAttribute("list", list);
		
		return "hello";
	}
	
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Model model, MemberDto dto) {
		logger.info("HelloController home() " + new Date());
		System.out.println(dto.toString());

		MemberDto mem = service.getmember(dto);
		model.addAttribute("mem", mem);
		
		return "home";
	}
	
}














