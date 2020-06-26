package kr.ac.sunmoon.mrs.recommendation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.movie.MovieMapper;
import kr.ac.sunmoon.mrs.review.ReviewMapper;

@Service
public class RecommendServiceImpl {
	/*
	 * @Autowired private MovieMapper movieMapper;
	 * 
	 * @Autowired private ReviewMapper reviewMapper;
	 * 
	 * public List<Movie> inquiryRankRecentlyList() {//영화 최근 등록 순 List<Movie> result
	 * = movieMapper.selectRankRecently();
	 * 
	 * return result; }
	 * 
	 * public List<Movie> inquiryRankViewList() {//영화 조회수 순 List<Movie> result =
	 * movieMapper.selectRankView();
	 * 
	 * return result; }
	 * 
	 * public List<Movie> inquiryRankReviewList() {//영화 리뷰 순 List<Movie> movie =
	 * reviewMapper.selectRankReview();
	 * 
	 * List<Movie> result = null; for (int i = 0; i < movie.size(); i++) { result =
	 * (List<Movie>) movieMapper.selectMovie(movie.get(i)); }
	 * 
	 * return result; }
	 */
}
