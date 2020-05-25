package kr.ac.sunmoon.mrs.tester;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesterController {
	
	@GetMapping(value = "/")
	public String tester() {
		System.out.println("jsp 호출 성공");
		return "index";
	}
}
