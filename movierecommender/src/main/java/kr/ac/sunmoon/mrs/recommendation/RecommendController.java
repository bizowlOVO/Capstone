package kr.ac.sunmoon.mrs.recommendation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.sunmoon.mrs.agent.Movie;

@RestController
public class RecommendController {
	@Autowired
	RecommendService recommendService;
	
	public void mostViewMovie() {
		List<Movie> result = recommendService.mostViewMovie();
	}
	
	public void mostReviewMovie() {
		List<Movie> result = recommendService.mostReviewMovie();
	}
}
