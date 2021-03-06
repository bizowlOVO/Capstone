package kr.ac.sunmoon.mrs.movie;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Movie;

@Mapper
public interface MovieMapper {
	public Movie selectMovie(Movie movie);
	
	public void updateView(Movie movie);
	
	public List<Movie> selectMovieAll();
	
	public void insertMovie(Movie movie);
	
	public void updateMovie(Movie movie);
	
	public void deleteMovie(Movie movie);
	
	public List<Movie> selectSearchMovie(String search);
	
	public List<Movie> selectRankRecently();
	
	public List<Movie> selectRankView();
	
	public void updateMovieAvgGrade(Movie movie);
	
	public List<Movie> selectRankReview();
}
