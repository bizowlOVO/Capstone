package kr.ac.sunmoon.mrs.review;

import java.util.List;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.agent.Review;

public interface ReviewService {
	public void addReview(Review review);
	public void updateReview(Review review);
	public void deleteReview(Review review);
	public Review inquiryReview(Review review);
	public List<Review> inquiryReviewList(Review review);
	public void updateMovieAvgGrade(int movieSeq);
	public List<Review> inquiryAdminReviewList();
}
