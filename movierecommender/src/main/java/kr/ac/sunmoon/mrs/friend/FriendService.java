package kr.ac.sunmoon.mrs.friend;

import java.util.List;
import kr.ac.sunmoon.mrs.agent.Friend;

public interface FriendService {
	public boolean addFriend(Friend friend);
	
	public void deleteFriend(Friend friend);
	
	public List<Friend> inquiryFriendList();
}
