package kr.ac.sunmoon.mrs.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Genre;
import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.genre.GenreMapper;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieMapper movieMapper;
	@Autowired
	private GenreMapper genreMapper;

	public List<Genre> getGenreList() {
		return genreMapper.selectGenreAll();
	}
	
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
		return movieMapper.selectMovie(movie);
	}

	public List<Movie> inquiryMovieAll() {
		return movieMapper.selectMovieAll();
	}

}
