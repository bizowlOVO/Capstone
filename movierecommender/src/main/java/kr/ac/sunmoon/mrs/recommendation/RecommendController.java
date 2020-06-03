package kr.ac.sunmoon.mrs.recommendation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.sunmoon.mrs.agent.Movie;

@RestController
public class RecommendController {
	@Autowired
	RecommendService recommendService;
	
	public void mostViewMovie() {
		Movie result = recommendService.mostViewMovie();
	}
	
	public void mostReviewMovie() {
		Movie result = recommendService.mostReviewMovie();
	}
}
