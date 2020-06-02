package kr.ac.sunmoon.mrs.recommendation;

import kr.ac.sunmoon.mrs.agent.Movie;

public interface RecommendService {
	public Movie mostViewMovie();
	public Movie mostReviewMovie();
}