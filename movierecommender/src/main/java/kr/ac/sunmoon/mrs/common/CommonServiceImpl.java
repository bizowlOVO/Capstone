package kr.ac.sunmoon.mrs.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import kr.ac.sunmoon.mrs.agent.Member;
import kr.ac.sunmoon.mrs.member.MemberMapper;

public class CommonServiceImpl implements CommonService {
	@Autowired
	private MemberMapper memberMapper;
	@Autowired
	private HttpServletRequest httpServletRequest;
	
	public boolean isLogin(Member member) {
		Member result = memberMapper.selectUser(member);
		
		if (result != null) {
			if (member.getMemberId() == result.getMemberId()
				&& member.getMemberPassword() == result.getMemberPassword()) {
				HttpSession session = httpServletRequest.getSession();
				session.setAttribute("id", "true");
				
				return true;
			}
		}
		return false;
	}
	
	public void logout () {
		HttpSession session = httpServletRequest.getSession(false);
		session.invalidate();
	}
}
