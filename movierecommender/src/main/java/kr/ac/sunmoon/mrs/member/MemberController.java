package kr.ac.sunmoon.mrs.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.sunmoon.mrs.agent.Member;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/member")
	public ModelAndView addmemberInfo(Member member) {
		return null;
	}
	
	@GetMapping("/member/addform")
	public ModelAndView addmemberInfo() {
		return null;
	}
	
	@PostMapping("/member/{id}")
	public ModelAndView editMemberInfo(Member member) {
		return null;
	}
	
	@GetMapping("/member/{id}/editform")
	public ModelAndView editMemberInfo() {
		return null;
	}
	
	@DeleteMapping("/member/{id}")
	public ModelAndView deleteMember(Member member) {
		return null;
	}
	
	@GetMapping("/member/{memberId}")
	public ModelAndView inquiryMember(@PathVariable("memberId") String memberId, Member member) {
		ModelAndView mav = new ModelAndView("/member/inquiryMember");
		
		member.setMemberId(memberId);
		mav.addObject("member",memberService.inquiryMember(member));
		
		return mav;
	}
	
	@GetMapping("/member/{id}/isduplicate")
	public boolean isDuplicateMember(Member member) {
		return false;
	}
}
