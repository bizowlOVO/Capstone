package kr.ac.sunmoon.mrs.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Member;

@Mapper
public interface MemberMapper {	
	public Member selectMember(String memberId);
	
	public List<Member> selectMemberAll();
	
	public void insertMember(Member member);
	
	public void updateMember(Member member);
	
	public void deleteMember(String memberId);
	
	//public int loginChecker(String memberId, String memberPassword);
	
	public String isLogin(String memberId);
}
