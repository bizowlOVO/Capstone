package kr.ac.sunmoon.mrs.agent;

public class Friend {
	private int friendSeq;
	private String requestMember;
	private String receivedMember;
	private String friendState;
	
	public int getFriendSeq() {
		return friendSeq;
	}
	
	public void setFriendSeq(int friendSeq) {
		this.friendSeq = friendSeq;
	}
	
	public String getRequestFriend() {
		return requestMember;
	}
	
	public void setRequestUser(String requestMember) {
		this.requestMember = requestMember;
	}
	
	public String getReceivedFriend() {
		return receivedMember;
	}
	
	public void setReceivedFriend(String receivedMember) {
		this.receivedMember = receivedMember;
	}
	
	public String getFriendState() {
		return friendState;
	}
	
	public void setFriendState(String friendState) {
		this.friendState = friendState;
	}
}
