package kr.ac.sunmoon.mrs.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.ac.sunmoon.mrs.agent.Member;

@Mapper
<<<<<<< HEAD
public interface MemberMapper {	
	public Member selectMember(String memberId);
	
	public List<Member> selectMemberAll();
	
	public void insertMember(Member member);
	
	public void updateMember(Member member);
	
	public void deleteMember(String memberId);
	 
	public Member isLogin(String memberId);
	
	public void updateMemberMovieSeq(Member member);
	
	public int isDuplicateMember(String memberId);
}
=======
public interface MemberMapper {   
   public Member selectMember(String memberId);
   
   public List<Member> selectMemberAll();
   
   public void insertMember(Member member);
   
   public void updateMember(Member member);
   
   public void deleteMember(String memberId);
    
   public Member isLogin(String memberId);
   
   public void updateMemberMovieSeq(Member member);
   
   public int isDuplicateMember(String memberId);
}
>>>>>>> Lsj
