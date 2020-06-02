package kr.ac.sunmoon.mrs.common;

import kr.ac.sunmoon.mrs.agent.User;

public interface CommonService {
	public boolean isLogin(User user);
	public void logout();
}
