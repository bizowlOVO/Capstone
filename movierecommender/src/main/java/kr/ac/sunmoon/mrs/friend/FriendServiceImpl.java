package kr.ac.sunmoon.mrs.friend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Friend;

@Service
public class FriendServiceImpl implements FriendService {
	@Autowired
	private FriendMapper friendMapper;

	public boolean addFriend(Friend friend) {
		Friend result = friendMapper.selectFriend(friend);
		if (result == null) {
			return false;
		} else {
			friendMapper.insertFriend(friend);
			return true;
		}
	}

	public void deleteFriend(Friend friend) {
		friendMapper.deleteFriend(friend);
	}

	public List<Friend> inquiryFriendList() {
		List<Friend> result = friendMapper.selectFriendAll();
		
		return result;
	}
}
