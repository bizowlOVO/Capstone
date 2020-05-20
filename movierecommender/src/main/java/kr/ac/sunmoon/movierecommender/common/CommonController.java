package kr.ac.sunmoon.movierecommender.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {
	@GetMapping(value = "/common/login")
	public ModelAndView login() {
		ModelAndView mav = null;
		mav = new ModelAndView("/common/login");
		return mav;
	}
}
