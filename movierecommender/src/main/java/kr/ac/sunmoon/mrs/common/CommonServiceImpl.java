package kr.ac.sunmoon.mrs.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Member;
import kr.ac.sunmoon.mrs.member.MemberMapper;

@Service
public class CommonServiceImpl implements CommonService {
	@Autowired
	MemberMapper memberMapper;
	Member member;
	
	@Autowired
	private HttpServletRequest httpServletRequest;
	
	public boolean isLogin(Member member) {
		boolean loginCheck = false;
		String memberId = member.getMemberId();
		String memberPassword = member.getMemberPassword();
		
		if (memberId != null && memberPassword != null 
				&& !memberId.equals("") && !memberPassword.equals("")) {
			String result = memberMapper.isLogin(memberId);
			if (result != null && !result.equals("")) {
				if (result.equals(memberPassword)) {
					System.out.println("조회된 정보가 존재합니다");
					loginCheck = true;
					
					HttpSession session = httpServletRequest.getSession();
					Member memberInfo = memberMapper.selectMember(memberId);
					session.setAttribute("id", member.getMemberId());
					session.setAttribute("memberInfo", memberInfo);
					session.setMaxInactiveInterval(10*60);
				} else {
					System.out.println("조회된 정보 없음");
				}
			} 
		} else {
			System.out.println("입력값이 유효하지 않음");
		}
	
		return loginCheck;
	}
	
	public void logout () {
		HttpSession session = httpServletRequest.getSession(false);
		session.invalidate();
	}
}
