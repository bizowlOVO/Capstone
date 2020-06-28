package kr.ac.sunmoon.mrs.bookmark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Bookmark;
import kr.ac.sunmoon.mrs.agent.Member;

@Service
public class BookmarkServiceImpl implements BookmarkService {
	@Autowired
	private BookmarkMapper bookmarkMapper;

	@Override
	public void addBookmark(Member member) {
		bookmarkMapper.selectBookmark(member);
		String memberId = member.getMemberId();
		if(memberId == null) {
			bookmarkMapper.insertBookmark(member);
		} else {
			//bookmark가 이미 눌려져있는데 또 하트를 눌렀을때 
		}
		
	}

	@Override
	public void deleteBookmark(int bookmarkSeq) {
		bookmarkMapper.deleteBookmark(bookmarkSeq);
	}

	@Override
	public List<Bookmark> inquiryMemberBookmark(String memberId) { //마이페이지에 본인의 Bookmark가 보이는 기능
		return bookmarkMapper.selectMemberBookmark(memberId);
	}
	
	

}
