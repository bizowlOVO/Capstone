package kr.ac.sunmoon.mrs.movie;

import java.util.List;

import kr.ac.sunmoon.mrs.agent.Genre;
import kr.ac.sunmoon.mrs.agent.Movie;

public interface MovieService {
	public List<Genre> getGenreList();
	
	public void addMovieInfo(Movie movie);
	
	public void updateMovieInfo(Movie movie);
	
	public void deleteMovieInfo(Movie movie);
	
	public Movie inquiryMovie(Movie movie);
	
	public List<Movie> inquiryMovieAll();
}
