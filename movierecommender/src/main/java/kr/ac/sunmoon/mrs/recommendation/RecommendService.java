package kr.ac.sunmoon.mrs.recommendation;

import java.util.List;

import kr.ac.sunmoon.mrs.agent.Movie;

public interface RecommendService {
	public List<Movie> mostViewMovie();
	public List<Movie> mostReviewMovie();
}