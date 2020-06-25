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
		System.out.println("commonService!!!!!!!!!!!!!!!!!!!!!");
		boolean loginCheck = false;
		String memberId = member.getMemberId();
		String memberPassword = member.getMemberPassword();
		System.out.println(memberId + "," + memberPassword);
		
		if (memberId != null &&
				memberPassword != null &&
				!memberId.equals("")&&
				!memberPassword.equals("")) {
			System.out.println("들어옴!!!!!!!!!");
			System.out.println(memberMapper.loginChecker(memberId, memberPassword));
			if (memberMapper.loginChecker(memberId, memberPassword) == 1) {
				System.out.println("조회된 정보가 존재합니다");
				loginCheck = true;
				HttpSession session = httpServletRequest.getSession();
				Member memberInfo = memberMapper.selectMember(memberId);
				session.setAttribute("id", member.getMemberId());
				session.setAttribute("memberInfo", memberInfo);
				session.setMaxInactiveInterval(10*60);
				
			}else {
				System.out.println("조회된 정보 없음");
				loginCheck = false;
			}
		}else {
			System.out.println("입력값이 유효하지 않음");
			loginCheck = false;
		}
		return loginCheck;
	}
	
	public void logout () {
		HttpSession session = httpServletRequest.getSession(false);
		session.invalidate();
	}
}
