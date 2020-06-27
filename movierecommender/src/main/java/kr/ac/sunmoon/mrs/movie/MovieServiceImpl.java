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
		Movie result = movieMapper.selectMovie(movie);
		movieMapper.updateView(result);
		
		Genre genre = new Genre();
		if (result.getGenreFirst() != null 
						&& result.getGenreSecond() != null) {
			genre.setGenreCode(result.getGenreFirst());
			result.setGenreFirst(genreMapper.selectGenre(genre).getGenre());
			genre.setGenreCode(result.getGenreSecond());
			result.setGenreSecond(genreMapper.selectGenre(genre).getGenre());
			
		} else {
			result.setGenreFirst("");
			result.setGenreSecond("");
		}
		
		return result;
	}

	public List<Movie> inquiryMovieAll() {
		List<Movie> result = movieMapper.selectMovieAll();
		
		Genre genre = new Genre();
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).getGenreFirst() != null 
									&& result.get(i).getGenreSecond() != null) {
				genre.setGenreCode(result.get(i).getGenreFirst());
				result.get(i).setGenreFirst(genreMapper.selectGenre(genre).getGenre());
				genre.setGenreCode(result.get(i).getGenreSecond());
				result.get(i).setGenreSecond(genreMapper.selectGenre(genre).getGenre());
			} else {
				result.get(i).setGenreFirst("");
				result.get(i).setGenreSecond("");
			}
		}
		
		return result;
	}

}
