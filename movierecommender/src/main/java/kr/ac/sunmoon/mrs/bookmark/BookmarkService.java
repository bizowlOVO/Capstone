package kr.ac.sunmoon.mrs.bookmark;

import java.util.List;

import kr.ac.sunmoon.mrs.agent.Bookmark;
import kr.ac.sunmoon.mrs.agent.Member;

public interface BookmarkService {
	public void addBookmark(Member member);
	public void deleteBookmark(int bookmarkSeq);
	public List<Bookmark> inquiryMemberBookmark(String memberId);
}
