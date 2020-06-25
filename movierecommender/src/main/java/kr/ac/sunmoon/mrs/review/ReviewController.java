package kr.ac.sunmoon.mrs.review;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.agent.Review;
import kr.ac.sunmoon.mrs.movie.MovieService;

@RestController
public class ReviewController {
	@Autowired
	ReviewServiceImpl reviewServiceImpl;
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value="/review", method = RequestMethod.POST)
	public ModelAndView addReview(Review review, HttpServletRequest request) {
		review.setMemberId(request.getParameter("memberId"));
		review.setMovieSeq(Integer.parseInt(request.getParameter("movieSeq")));
		review.setReviewComment(request.getParameter("reviewComment"));
		
		reviewServiceImpl.addReview(review);
		
		ModelAndView mav = new ModelAndView(new RedirectView("/movie/list"));
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
	
	@GetMapping(value="/review/list/{movieSeq}")
	public ModelAndView inquiryReviewList(@PathVariable int movieSeq) {
		Review review = new Review();
		review.setMovieSeq(movieSeq);
		List<Review> reviews = reviewServiceImpl.inquiryReviewList(review);
		ModelAndView mav = new ModelAndView();
		mav.addObject("reviews", reviews);
		return mav;
	}
	
}
