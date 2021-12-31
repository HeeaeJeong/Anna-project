package mul.camp.a.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.service.BbsService;

@Controller
public class BbsController {

	private static Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	@Autowired
	BbsService service;
	
	@RequestMapping(value = "bbslist.do", method = RequestMethod.GET)
	public String bbslist(Model model) {
		logger.info("BbsController bbslist() " + new Date());
		
		List<BbsDto> list = service.bbslist();
		model.addAttribute("bbslist", list);
		
		return "bbslist";
	}
	
	@RequestMapping(value = "bbswrite.do", method = RequestMethod.GET)
	public String bbswrite() {
		logger.info("BbsController bbswrite() " + new Date());
		
		return "bbswrite";
	}
	
	@RequestMapping(value = "bbswriteAf.do", method = RequestMethod.POST)
	public String bbswriteAf(BbsDto dto) {
		logger.info("BbsController bbswriteAf() " + new Date());
		System.out.println(dto.toString());		// 확인
		
		boolean b = service.writebbs(dto);
		if(b == true) {
			System.out.println("성공적으로 추가되었습니다");
		}
		
		return "redirect:/bbslist.do";
	}
	
	
}







