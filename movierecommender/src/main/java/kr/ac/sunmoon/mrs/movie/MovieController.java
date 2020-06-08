package kr.ac.sunmoon.mrs.movie;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Movie;

@RestController
public class MovieController {
	@PostMapping(value = "/movie")
	public ModelAndView addMovieInfo() {
		ModelAndView mav = null;
		mav = new ModelAndView(new RedirectView("/movie/movieList"));
		
		return mav;
	}
	
	@GetMapping(value = "/movie/addform")
	public ModelAndView addMovieInfo(Movie movie) {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/insertMovie");
		
		return mav;
	}
	
	@PostMapping(value = "/movie/{id}")
	public ModelAndView updateMovieInfo() {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/movieList");
		
		return mav;
	}
	
	@GetMapping(value = "/movie/{id}/editform")
	 public ModelAndView updateMovieInfo(Movie movie) {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/editMovie");
		
		return mav;
	}
	
	@DeleteMapping(value = "/movie/{id}")
	public ModelAndView deleteMovieInfo(Movie movie) {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/movieList");
		
		return mav;
	}
	
	@GetMapping(value = "/movie/{id}")
	public ModelAndView inquiryMovieInfo(Movie movie) {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/inquiryMovie");
		
		return mav;
	}
	
	@GetMapping(value = "/movie/list")
	public ModelAndView inquiryMovieList() {
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/movieList");
		
		return mav;
	}
}
