package kr.ac.sunmoon.mrs.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	public Boolean addMemberInfo(Member member) {
		if (!member.getMemberId().equals("")
				&& !member.getMemberPassword().equals("")
				&& !member.getMemberName().equals("")
				&& !member.getMemberGender().equals("")) {
			memberMapper.insertMember(member);
			return true;
		} else {
			return false;
		}
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

	public Boolean isDuplicateMember(String memberId) {
		if(memberMapper.isDuplicateMember(memberId) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void updateMemberMovieSeq(Member member) {
		memberMapper.updateMemberMovieSeq(member);
	}

}
