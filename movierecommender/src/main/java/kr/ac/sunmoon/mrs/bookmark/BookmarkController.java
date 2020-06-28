package kr.ac.sunmoon.mrs.bookmark;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Member;

@RestController
public class BookmarkController {
	@Autowired
	private BookmarkService bookmarkService;
	
	@Autowired
	private HttpServletRequest httpServletRequest;
	
	@GetMapping("/bookmark/{movieSeq}")
	public ModelAndView addBookmark(@PathVariable("movieSeq") int movieSeq)  {
		HttpSession session = httpServletRequest.getSession();
		String memberId = (String) session.getAttribute("id");
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMovieSeq(movieSeq);
		bookmarkService.addBookmark(member);
		
		return new ModelAndView(new RedirectView("/movie/inquiry"));
	}
	
	@GetMapping("/bookmark/{bookmarkSeq}")
	public ModelAndView deleteBookmark(@PathVariable("bookmarkSeq") int bookmarkSeq) {
		
		bookmarkService.deleteBookmark(bookmarkSeq);
		
		HttpSession session = httpServletRequest.getSession();
		String id = (String) session.getAttribute("id");
		return new ModelAndView(new RedirectView("/member/" + id));
	}
	
	
}
