package kr.ac.sunmoon.mrs.recommendation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.movie.MovieMapper;
import kr.ac.sunmoon.mrs.review.ReviewMapper;

@Service
public class RecommendServiceImpl implements RecommendService {
	@Autowired
	private MovieMapper movieMapper;
	@Autowired
	private ReviewMapper reviewMapper;
	
	public List<Movie> mostViewMovie() {
		List<Movie> result = movieMapper.mostViewMovie();
		
		return result;
	}

	public List<Movie> mostReviewMovie() {
		return null;
	}
}
