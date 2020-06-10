package kr.ac.sunmoon.mrs.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Member;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/member")
	public ModelAndView addmemberInfo(Member member) {
		this.memberService.addMemberInfo(member);
		return new ModelAndView(new RedirectView("/member/" + member.getMemberId()));
	}
	
	@GetMapping("/member/addform")
	public ModelAndView addmemberInfo() {
		return new ModelAndView("/member/insertMember");
	}
	// 수정
	@PostMapping("/member/{memberId}")
	public ModelAndView editMemberInfo(Member member) {
		this.memberService.editMemberInfo(member);
		return new ModelAndView(new RedirectView("/member/" + member.getMemberId()));
	}
	// 수정폼
	@GetMapping("/member/{memberId}/editform")
	public ModelAndView editMemberInfo(@PathVariable("memberId") String memberId) {
		ModelAndView mav = new ModelAndView("/member/editMember");
		
		mav.addObject("member", this.memberService.inquiryMember(memberId));
		return mav;
	}
	
	@DeleteMapping("/member/{memberId}")
	public ModelAndView deleteMember(Member member) {
		return null;
	}
	
	@GetMapping("/member/{memberId}") //아직 매퍼쪽 부분이 안된 기능
	public ModelAndView inquiryMember(@PathVariable("memberId") String memberId) {
		ModelAndView mav = new ModelAndView("/member/inquiryMember");
		
		mav.addObject("member",memberService.inquiryMember(memberId));
		
		return mav;
	}
	
	@GetMapping("/member/{memberId}/isduplicate")
	public boolean isDuplicateMember(Member member) {
		return false;
	}
}
