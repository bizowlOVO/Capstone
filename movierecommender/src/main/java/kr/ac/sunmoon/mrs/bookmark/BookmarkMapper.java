package kr.ac.sunmoon.mrs.bookmark;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import kr.ac.sunmoon.mrs.agent.Bookmark;
import kr.ac.sunmoon.mrs.agent.Member;

@Mapper
public interface BookmarkMapper {
	public void insertBookmark(Member member);
	public void deleteBookmark(int bookmarkSeq);
	public String selectBookmark(Member member);
	public List<Bookmark> selectMemberBookmark(String memberId);
}
