package ksmybatis.admin.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.member.domain.Member;

@Mapper
public interface MemberMapper {
	
	//회원탈퇴
	int removeMemberById(String memberId);
	
	// 특정 회원 로그인 이력 삭제
	int removeMemberLoginLogById(String memberId);
	
	// 특정 회원 수정
	int modifyMemberInfo(Member member);
	
	//특정 회원 조회
	Member getMemberInfoById(String memberId);
	
	//회원등록
	int addMember(Member member);
	
	//중복아이디 체크
	boolean checkMemberById(String memberId);
	
	//회원 목록 조회 - List 반복해서 담아줌-반환값이 많을 때.
	List<Member> getMemberList();
	
}
