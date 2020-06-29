package kr.ac.sunmoon.mrs.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.sunmoon.mrs.agent.Member;

@RestController
	public class AdminController {
		
		@GetMapping("/admin/mainpage")
		public ModelAndView adminMainpage(Member member) {
			return new ModelAndView("/admin/mainpage");
		}
}
