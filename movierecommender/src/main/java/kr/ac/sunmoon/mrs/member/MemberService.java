package kr.ac.sunmoon.mrs.member;

import kr.ac.sunmoon.mrs.agent.Member;

public interface MemberService {
	public void addMemberInfo(Member member);
	public void editMemberInfo(Member member);
	public void deleteMember(Member member);
	public Member inquiryMember(String memberId);
	public Boolean isDuplicateMember(Member member);
}
