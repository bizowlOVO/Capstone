package kr.ac.sunmoon.mrs.common;

import kr.ac.sunmoon.mrs.agent.Member;

public interface CommonService {
	public boolean isLogin(Member member);
	public void logout();
}
