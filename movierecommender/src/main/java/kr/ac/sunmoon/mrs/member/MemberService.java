package kr.ac.sunmoon.mrs.member;

import kr.ac.sunmoon.mrs.agent.Member;

public interface MemberService {
	public void addMemberInfo(Member member);
	public void editMemberInfo(Member member);
	public void deleteMember(String memberId);
	public Member inquiryMember(String memberId);
	public Boolean isDuplicateMember(Member member);
	public void updateMemberMovieSeq(Member member);
}
