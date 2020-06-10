package kr.ac.sunmoon.mrs.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.sunmoon.mrs.agent.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public void addMemberInfo(Member member) {
		memberMapper.insertMember(member);
	}

	@Override
	public void editMemberInfo(Member member) {
		memberMapper.updateMember(member);
	}

	@Override
	public void deleteMember(Member member) {
		
	}

	@Override
	public Member inquiryMember(String memberId) {
		return this.memberMapper.selectMember(memberId);
	}

	@Override
	public Boolean isDuplicateMember(Member member) {
		return null;
	}

}
