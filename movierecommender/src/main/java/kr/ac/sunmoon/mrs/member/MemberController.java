package kr.ac.sunmoon.mrs.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Member;
import kr.ac.sunmoon.mrs.agent.Movie;
import kr.ac.sunmoon.mrs.recommendation.RecommendService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private RecommendService recommendService;
	
	@GetMapping(value = "/member/mainpage")
	public ModelAndView doMain() { 
		ModelAndView mav = new ModelAndView("/member/mainpage");
		
		List<Movie> recentlyMovie = recommendService.inquiryRankRecentlyList();
		List<Movie> viewMovie = recommendService.inquiryRankViewList();
		
		mav.addObject("recentlyMovie", recentlyMovie);
		mav.addObject("viewMovie", viewMovie);
		
		for(int i = 0; i < recentlyMovie.size(); i++) {
			System.out.println(recentlyMovie.get(i).getTitle());
			System.out.println(viewMovie.get(i).getVisitCount());
		}
		
		return mav;
	}
	
	@PostMapping("/member")
	public ModelAndView addmemberInfo(Member member) {
	   if(this.memberService.addMemberInfo(member) == true) {
		   return new ModelAndView(new RedirectView("/common/login"));
	   } else {
		   ModelAndView mav = new ModelAndView("/member/insertMember");
	       return mav;
	   }
	      
	   }
	
	@GetMapping("/member/addform")
	public ModelAndView addmemberInfo() {
		return new ModelAndView("/member/insertMember");
	}

	@PostMapping("/member/{memberId}")
	public ModelAndView editMemberInfo(Member member) {
		this.memberService.editMemberInfo(member);
		return new ModelAndView(new RedirectView("/member/" + member.getMemberId()));
	}

	@GetMapping("/member/{memberId}/editform")
	public ModelAndView editMemberInfo(@PathVariable("memberId") String memberId) {
		ModelAndView mav = new ModelAndView("/member/editMember");
		
		mav.addObject("member", this.memberService.inquiryMember(memberId));
		return mav;
	}

	@GetMapping("/member/{memberId}/delete")
	public ModelAndView deleteMember(@PathVariable("memberId") String memberId) {
		this.memberService.deleteMember(memberId);
		return new ModelAndView(new RedirectView("/member/mainpage"));
	}
	
	@GetMapping("/member/{memberId}") //아직 매퍼쪽 부분이 안된 기능
	public ModelAndView inquiryMember(@PathVariable("memberId") String memberId) {
		ModelAndView mav = new ModelAndView("/member/inquiryMember");
		
		mav.addObject("member",memberService.inquiryMember(memberId));
		
		return mav;
	}
	
	@GetMapping("/member/addform/isduplicate")
	public boolean isDuplicateMember(@RequestParam("memberId") String memberId) {
	    return memberService.isDuplicateMember(memberId);
	}
	
	@GetMapping("/member/domypage")
	public ModelAndView doMyPage() {
		ModelAndView mav = new ModelAndView("/member/mypage");
		return mav;
	}
}
