package kr.ac.sunmoon.mrs.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieMapper movieMapper;

	public void addMovieInfo(Movie movie) {
		movieMapper.insertMovie(movie);
	}

	public void updateMovieInfo(Movie movie) {
		movieMapper.updateMovie(movie);
	}

	public void deleteMovieInfo(Movie movie) {
		movieMapper.deleteMovie(movie);
	}

	public Movie inquiryMovie(Movie movie) {
		Movie result = movieMapper.selectMovie(movie);
		
		return result;
		
	}

	public List<Movie> inquiryMovieAll() {
		List<Movie> result = movieMapper.selectMovieAll();
		
		return result;
	}

}
