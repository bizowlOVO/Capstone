package kr.ac.sunmoon.mrs.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.agent.Review;
import kr.ac.sunmoon.mrs.movie.MovieMapper;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	ReviewMapper reviewMapper;
	@Autowired
	MovieMapper movieMapper;
	
	public void addReview(Review review) {
		reviewMapper.addReview(review);
	}

	public void updateReview(Review review) {
		reviewMapper.updateReview(review);
	}

	public void deleteReview(Review review) {
		reviewMapper.deleteReview(review);
	}

	public Review inquiryReview(Review review) {
		return reviewMapper.selectReview(review);
	}

	public List<Review> inquiryReviewList(Review review) {
		return reviewMapper.selectReviewAll(review);
	}
	
	public void updateMovieAvgGrade(int movieSeq) {
		int avgGrade = reviewMapper.selectMovieAvgGrade(movieSeq);
		Movie movie = new Movie();
		movie.setMovieSeq(movieSeq);
		movie.setAvgGrade(avgGrade);
		
		movieMapper.updateMovieAvgGrade(movie);
	}

	@Override
	public List<Review> inquiryAdminReviewList() {
		return reviewMapper.selectAdminReviewAll();
	}
}
