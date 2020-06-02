package kr.ac.sunmoon.mrs.agent;

public class Friend {
	private int friendSeq;
	private String requestUser;
	private String receivedUser;
	private String friendState;
	
	public int getFriendSeq() {
		return friendSeq;
	}
	
	public void setFriendSeq(int friendSeq) {
		this.friendSeq = friendSeq;
	}
	
	public String getRequestUser() {
		return requestUser;
	}
	
	public void setRequestUser(String requestUser) {
		this.requestUser = requestUser;
	}
	
	public String getReceivedUser() {
		return receivedUser;
	}
	
	public void setReceivedUser(String receivedUser) {
		this.receivedUser = receivedUser;
	}
	
	public String getFriendState() {
		return friendState;
	}
	
	public void setFriendState(String friendState) {
		this.friendState = friendState;
	}
}
