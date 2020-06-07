package kr.ac.sunmoon.mrs.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	ReviewMapper reviewMapper;
	
	@Override
	public void addReview(Review review) {
		reviewMapper.addReview(review);
	}

	@Override
	public void updateReview(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteReview(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Review inquiryReview(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> inquiryReviewList(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

}
