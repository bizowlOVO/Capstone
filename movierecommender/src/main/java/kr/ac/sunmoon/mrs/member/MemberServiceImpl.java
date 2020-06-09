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
		
	}

	@Override
	public void editMemberInfo(Member member) {
		
	}

	@Override
	public void deleteMember(Member member) {
		
	}

	@Override
	public Member inquiryMember(Member member) {
		memberMapper.selectMember(member);
		System.err.println(member.getMemberAge());
		return this.memberMapper.selectMember(member);
	}

	@Override
	public Boolean isDuplicateMember(Member member) {
		return null;
	}

}
