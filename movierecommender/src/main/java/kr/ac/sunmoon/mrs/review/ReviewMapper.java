package kr.ac.sunmoon.mrs.review;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.agent.Review;

@Mapper
public interface ReviewMapper {
	public Review selectReview(Review review);
	
	public List<Review> selectReviewAll();
	
	public void insertReview(Review review);
	
	public void updateReview(Review review);
	
	public void deleteReview();
	
	public Movie mostReviewMovie();
}
