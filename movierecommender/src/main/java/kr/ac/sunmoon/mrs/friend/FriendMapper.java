package kr.ac.sunmoon.mrs.friend;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Friend;

@Mapper
public interface FriendMapper {	
	public List<Friend> selectFriendAll();
	
	public void insertFriend(Friend friend);
	
	public void deleteFriend(Friend friend);
}
