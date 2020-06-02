package kr.ac.sunmoon.mrs.agent;

public class Review {
	private int reviewSeq;
	private String userId;
	private int movieSeq;
	private String reviewComment;
	private String reviewPostDate;
	
	public int getReviewSeq() {
		return reviewSeq;
	}
	
	public void setReviewSeq(int reviewSeq) {
		this.reviewSeq = reviewSeq;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getMovieSeq() {
		return movieSeq;
	}
	
	public void setMovieSeq(int movieSeq) {
		this.movieSeq = movieSeq;
	}
	
	public String getReviewComment() {
		return reviewComment;
	}
	
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	
	public String getReviewPostDate() {
		return reviewPostDate;
	}
	
	public void setReviewPostDate(String reviewPostDate) {
		this.reviewPostDate = reviewPostDate;
	}
}
