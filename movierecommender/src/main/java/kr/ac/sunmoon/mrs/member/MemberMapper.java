package kr.ac.sunmoon.mrs.member;

import java.util.List;

import kr.ac.sunmoon.mrs.agent.Member;

public interface MemberMapper {	
	public Member selectMember(Member member);
	
	public List<Member> selectMemberAll();
	
	public void insertMember(Member member);
	
	public void updateMember(Member member);
	
	public void deleteMember(Member member);
}
