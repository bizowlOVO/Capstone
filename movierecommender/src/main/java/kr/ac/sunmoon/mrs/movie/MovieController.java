package kr.ac.sunmoon.mrs.movie;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ModelAndView addMovieInfo(Movie movie) {//영화등록폼
		List<Genre> genre = movieService.getGenreList();
		
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/insertMovie");
		mav.addObject("genre", genre);
		
		return mav;
	}
	
	@PostMapping(value = "/movie")
	public ModelAndView addMovieInfo(HttpServletRequest request) {//영화정보등록
		
		Movie movie = new Movie(); movie.setTitle(request.getParameter("title"));
		movie.setReleaseDate(request.getParameter("releaseDate"));
		movie.setSynopsis(request.getParameter("synopsis"));
		movie.setFilmAge(Integer.parseInt(request.getParameter("filmAge")));
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
	
	@GetMapping(value = "/movie/{movieSeq}/editform")
	 public ModelAndView updateMovieInfo(@PathVariable int movieSeq) {//영화수정폼
		Movie movie = new Movie();
		movie.setMovieSeq(movieSeq);
		movie = movieService.inquiryMovie(movie);
		
		List<Genre> genre = movieService.getGenreList();
		
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/editMovie");
		mav.addObject("movie", movie);
		mav.addObject("genre", genre);
		
		return mav;
	}
	
	@PostMapping(value = "/movie/{movieSeq}")
	public ModelAndView updateMovieInfo(HttpServletRequest request, @PathVariable int movieSeq) {//영화정보수정
		Movie movie = new Movie();
		movie.setTitle(request.getParameter("title"));
		movie.setMovieSeq(movieSeq);
		//movie.setReleaseDate(request.getParameter("releaseDate"));
		movie.setSynopsis(request.getParameter("synopsis"));
		movie.setFilmAge(Integer.parseInt(request.getParameter("filmAge")));
		movie.setDirectCountry(request.getParameter("directCountry"));
		movie.setRunningTime(Integer.parseInt(request.getParameter("runningTime")));
		movie.setDownloadLink(request.getParameter("downloadLink"));
		movie.setGenreFirst(request.getParameter("genreFirst"));
		movie.setGenreSecond(request.getParameter("genreSecond"));
		movie.setDirectorSeq(Integer.parseInt(request.getParameter("directorSeq")));
		movieService.updateMovieInfo(movie);
		
		ModelAndView mav = null;
		mav = new ModelAndView(new RedirectView("/movie/list"));
		
		return mav;
	}
	
	@GetMapping(value = "/movie/{movieSeq}/delete")
	public ModelAndView deleteMovieInfo(@PathVariable int movieSeq) {
		Movie movie = new Movie();
		movie.setMovieSeq(movieSeq);
		movieService.deleteMovieInfo(movie);
		
		ModelAndView mav = null;
		mav = new ModelAndView(new RedirectView("/movie/list"));
		
		System.out.println(movieSeq);
		
		return mav;
	}
	
	@GetMapping(value = "/movie/{movieSeq}")
	public ModelAndView inquiryMovieInfo(@PathVariable int movieSeq) {
		Movie movie = new Movie();
		movie.setMovieSeq(movieSeq);
		movie = movieService.inquiryMovie(movie);
		
		ModelAndView mav = null;
		mav = new ModelAndView("/movie/inquiryMovie");
		mav.addObject("movie", movie);
		
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
