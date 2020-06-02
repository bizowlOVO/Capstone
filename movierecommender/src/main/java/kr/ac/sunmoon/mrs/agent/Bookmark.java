package kr.ac.sunmoon.mrs.agent;

public class Bookmark {
	private int bookmarkSeq;
	private String userId;
	private int movieSeq;
	
	public int getBookmarkSeq() {
		return bookmarkSeq;
	}
	
	public void setBookmarkSeq(int bookmarkSeq) {
		this.bookmarkSeq = bookmarkSeq;
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
}
