package kr.ac.sunmoon.mrs.agent;

public class Member {
	private String memberId;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private String memberGender;
	private String memberState;
	private int movieSeq;
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberPassword() {
		return memberPassword;
	}
	
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public int getMemberAge() {
		return memberAge;
	}
	
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	public String getMemberGender() {
		return memberGender;
	}
	
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	
	public String getMemberState() {
		return memberState;
	}
	
	public void setMemberState(String memberState) {
		this.memberState = memberState;
	}

	public int getMovieSeq() {
		return movieSeq;
	}

	public void setMovieSeq(int movieSeq) {
		this.movieSeq = movieSeq;
	}
}
