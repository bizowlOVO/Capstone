package kr.ac.sunmoon.mrs.movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.sunmoon.mrs.agent.Movie;

@RestController
public class MovieController {

	@GetMapping(value = "/movie/list")
	public ModelAndView inquiryMovieList(Movie movie) {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/movielist");
		return mav;
		
	}
}
