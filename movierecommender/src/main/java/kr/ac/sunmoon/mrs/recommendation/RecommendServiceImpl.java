package kr.ac.sunmoon.mrs.recommendation;

import java.util.ArrayList;
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
	
	public List<Movie> inquiryRankRecentlyList() {
		return movieMapper.selectRankRecently();
	}

	public List<Movie> inquiryRankViewList() {
		return movieMapper.selectRankView();
	}

	public List<Movie> inquiryRankReviewList() {
		List<Movie> movieSeq = movieMapper.selectRankReview();
		
		List<Movie> movie = new ArrayList();
		
		for(int i = 0; i < movieSeq.size(); i++) {
			movie.add(movieMapper.selectMovie(movieSeq.get(i)));
		}
		
		return movie;
	}
}
