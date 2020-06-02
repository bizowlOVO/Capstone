package kr.ac.sunmoon.mrs.recommendation;

import org.springframework.beans.factory.annotation.Autowired;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.movie.MovieMapper;
import kr.ac.sunmoon.mrs.review.ReviewMapper;

public class RecommendServiceImpl implements RecommendService {
	@Autowired
	private MovieMapper movieMapper;
	@Autowired
	private ReviewMapper reviewMapper;
	
	public Movie mostViewMovie() {
		Movie result = movieMapper.mostViewMovie();
		return result;
	}

	public Movie mostReviewMovie() {
		Movie movieSeq = reviewMapper.mostReviewMovie();
		Movie result = movieMapper.selectMovie(movieSeq);
		
		return result;
	}
}
