package kr.ac.sunmoon.mrs.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MrsInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(60*30);
		
		if(session.getAttribute("memberInfo") == null) {
			response.sendRedirect("/common/login");
			return false;
		}
		return true;
	}
	
}
