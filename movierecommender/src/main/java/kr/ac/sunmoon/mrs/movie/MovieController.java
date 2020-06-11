package kr.ac.sunmoon.mrs.movie;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Genre;
import kr.ac.sunmoon.mrs.agent.Movie;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping(value = "/movie/addform")
	public ModelAndView addMovieInfo(Movie movie) {
		List<Genre> genre = movieService.getGenreList();
		
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/insertMovie");
		mav.addObject("genre", genre);
		
		return mav;
	}
	
	@PostMapping(value = "/movie")
	public ModelAndView addMovieInfo(HttpServletRequest request) {
		
		Movie movie = new Movie(); movie.setTitle(request.getParameter("title"));
		movie.setReleaseDate(request.getParameter("releaseDate"));
		movie.setSynopsis(request.getParameter("synopsis"));
		movie.setFilmAge(request.getParameter("filmAge"));
		movie.setDirectCountry(request.getParameter("directCountry"));
		movie.setRunningTime(Integer.parseInt(request.getParameter("runningTime")));
		movie.setDownloadLink(request.getParameter("downloadLink"));
		movie.setGenreFirst(request.getParameter("genreFirst"));
		movie.setGenreSecond(request.getParameter("genreSecond"));
		movieService.addMovieInfo(movie);
		
		ModelAndView mav = null;
		mav = new ModelAndView(new RedirectView("/movie/list"));
		
		return mav;
	}
	
	@PostMapping(value = "/movie/{id}")
	public ModelAndView updateMovieInfo(HttpServletRequest request) {
		Movie movie = new Movie(); movie.setTitle(request.getParameter("title"));
		movie.setReleaseDate(request.getParameter("releaseDate"));
		movie.setSynopsis(request.getParameter("synopsis"));
		movie.setFilmAge(request.getParameter("filmAge"));
		movie.setDirectCountry(request.getParameter("directCountry"));
		movie.setRunningTime(Integer.parseInt(request.getParameter("runningTime")));
		movie.setDownloadLink(request.getParameter("downloadLink"));
		movie.setGenreFirst(request.getParameter("genreFirst"));
		movie.setGenreSecond(request.getParameter("genreSecond"));
		movieService.updateMovieInfo(movie);
		
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
		List<Movie> movie = movieService.inquiryMovieAll();
		
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/movieList");
		mav.addObject("movie", movie);
		
		return mav;
	}
}
