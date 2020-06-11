package kr.ac.sunmoon.mrs.common;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Member;

@RestController
public class CommonController {//
	@Autowired
	private CommonService commonService;
	
	@GetMapping(value = "/common/mainpage")
	public ModelAndView doMain() {
		ModelAndView mav = new ModelAndView("/common/mainpage");
		return mav;
	}
	
	@GetMapping(value = "/common/login")
	public ModelAndView login() {
		ModelAndView mav = null;
		mav = new ModelAndView("/common/login");
		return mav;
	}
	
	@PostMapping(value = "/common/login")
	public ModelAndView login(Member member,HttpSession session) {
		boolean isLoginCheck = commonService.isLogin(member);
		ModelAndView mav = null;
		System.out.println(isLoginCheck);
		
		if (isLoginCheck == true) {
			mav = new ModelAndView(new RedirectView("/common/mainpage"));
			mav.addObject("sessionInfo", session);
		} else {
			System.out.println("login Failed");
			mav = new ModelAndView("/common/login");
			mav.addObject("revisit", "Y");
		}
		return mav;
	}
	
	@GetMapping(value = "/common/logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
        ModelAndView mav = new ModelAndView(new RedirectView("/common/login"));
        return mav;
	}
}