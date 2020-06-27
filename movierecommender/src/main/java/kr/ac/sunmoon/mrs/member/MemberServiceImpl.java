package kr.ac.sunmoon.mrs.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	public void addMemberInfo(Member member) {
		memberMapper.insertMember(member);
	}

	public void editMemberInfo(Member member) {
		memberMapper.updateMember(member);
	}

	public void deleteMember(String memberId) {
		memberMapper.deleteMember(memberId);
	}

	public Member inquiryMember(String memberId) {
		return this.memberMapper.selectMember(memberId);
	}

	public Boolean isDuplicateMember(Member member) {
		return null;
	}

	public void updateMemberMovieSeq(Member member) {
		memberMapper.updateMemberMovieSeq(member);
	}

}
