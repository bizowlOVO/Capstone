package kr.ac.sunmoon.mrs.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Review;

@RestController
public class ReviewController {
	@Autowired
	ReviewServiceImpl reviewServiceImpl;
	Review review;
	
	@PostMapping(value="/review")
	public ModelAndView addReview(Review review) {
		ModelAndView mav = new ModelAndView();
		reviewServiceImpl.addReview(review);
		return mav;
	}
	@GetMapping(value="/review/addform")
	public ModelAndView addReview() {
		ModelAndView mav = new ModelAndView("/review/insertreview");
		return mav;
	}
	
}
