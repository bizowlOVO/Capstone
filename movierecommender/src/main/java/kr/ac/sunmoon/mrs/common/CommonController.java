package kr.ac.sunmoon.mrs.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import kr.ac.sunmoon.mrs.agent.Member;

@Controller
public class CommonController {//
	@Autowired
	private CommonService commonService;
	
	@GetMapping(value = "/common/login")
	public ModelAndView login() {
		ModelAndView mav = null;
		mav = new ModelAndView("/common/login");
		return mav;
	}
	
	@PostMapping("/login")
	public ModelAndView login(Member member) {
		boolean result = this.commonService.isLogin(member);
		
		ModelAndView mav = new ModelAndView();
		if (result == true) {
			mav = new ModelAndView("redirect:/device");
		} else {
			mav = new ModelAndView("/common/login");
			mav.addObject("revisit", "Y");
		}
		
		return mav;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout() {
		this.commonService.logout();
		
		return new ModelAndView("redirect:/login");
	}
}