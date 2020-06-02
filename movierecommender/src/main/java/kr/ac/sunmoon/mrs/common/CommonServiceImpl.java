package kr.ac.sunmoon.mrs.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import kr.ac.sunmoon.mrs.agent.User;
import kr.ac.sunmoon.mrs.user.UserMapper;

public class CommonServiceImpl implements CommonService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private HttpServletRequest httpServletRequest;
	
	public boolean isLogin(User user) {
		User result = userMapper.selectUser(user);
		
		if (result != null) {
			if (user.getUserId() == result.getUserId()
				&& user.getUserPassword() == result.getUserPassword()) {
				HttpSession session = httpServletRequest.getSession();
				session.setAttribute("id", "true");
				
				return true;
			}
		}
		return false;
	}
	
	public void logout () {
		HttpSession session = httpServletRequest.getSession(false);
		session.invalidate();
	}
}
