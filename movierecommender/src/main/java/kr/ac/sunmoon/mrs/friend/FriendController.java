package kr.ac.sunmoon.mrs.friend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.mrs.agent.Friend;

@RestController
public class FriendController {
	@Autowired
	private FriendService friendService;
	
	@PostMapping(value = "/friend")
	public ModelAndView addFriend(Friend friend) {
		friendService.addFriend(friend);
		
		ModelAndView mav = null;
		mav = new ModelAndView(new RedirectView("/friend/list"));
		
		return mav;
	}
	
	@GetMapping(value = "/friend/{id}")
	public ModelAndView deleteFriend(Friend friend) {
		friendService.deleteFriend(friend);
		
		ModelAndView mav = null;
		mav = new ModelAndView(new RedirectView("/friend/list"));//forward로 감 수정해야 함.
		
		return mav;
	}
	
	@GetMapping(value = "/friend/list")
	public ModelAndView inquiryFriendList() {
		List<Friend> friend = friendService.inquiryFriendList();
		
		ModelAndView mav = null;
		mav = new ModelAndView("/friend/friendList");
		mav.addObject("friend", friend);
		
		return mav;
	}
}
