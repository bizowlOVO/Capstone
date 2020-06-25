package kr.ac.sunmoon.mrs.review;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.agent.Review;
import kr.ac.sunmoon.mrs.movie.MovieService;
import kr.ac.sunmoon.mrs.movie.MovieServiceImpl;

@RestController
public class ReviewController {
	@Autowired
	ReviewServiceImpl reviewServiceImpl;
	Review review;
	@Autowired
	MovieService movieService;
	Movie movie;
	
	@PostMapping(value="/review")
	public ModelAndView addReview(Review review) {
		ModelAndView mav = new ModelAndView();
		reviewServiceImpl.addReview(review);
		return mav;
	}
	@GetMapping(value="/review/addform/{movieSeq}")
	public ModelAndView addReview(@PathVariable int movieSeq) {
		Movie movie = new Movie();
		System.out.println(movieSeq);
		movie.setMovieSeq(movieSeq);
		System.out.println(movie.getMovieSeq());
		Movie movieInfo = movieService.inquiryMovie(movie);
		System.out.println(movieInfo.getTitle());
		ModelAndView mav = new ModelAndView("/review/insertReview");
		mav.addObject("movieInfo", movieInfo);
		return mav;
	}
	
}
