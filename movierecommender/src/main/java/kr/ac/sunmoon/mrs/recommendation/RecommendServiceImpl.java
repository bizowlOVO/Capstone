package kr.ac.sunmoon.mrs.recommendation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.movie.MovieMapper;

@Service
public class RecommendServiceImpl implements RecommendService {
	@Autowired
	private MovieMapper movieMapper;
	
	public List<Movie> inquiryRankRecentlyList() {
		return movieMapper.selectRankRecently();
	}

	public List<Movie> inquiryRankViewList() {
		return movieMapper.selectRankView();
	}

	public List<Movie> inquiryRankReviewList() {
		// TODO Auto-generated method stub
		return null;
	}
}
