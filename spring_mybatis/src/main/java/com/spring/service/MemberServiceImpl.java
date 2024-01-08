package com.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.spring.dao.MemberDAO;
import com.spring.dto.MemberVO;

public class MemberServiceImpl implements MemberService{

	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	@Override
	public List<MemberVO> list() throws SQLException {
		// TODO Auto-generated method stub
		return memberDAO.selectMemberList();
	}

	@Override
	public MemberVO detail(String id) throws SQLException {
		// TODO Auto-generated method stub
		return memberDAO.selectMemberById(id);
	}

	@Override
	public void regist(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		memberDAO.insertMember(member);
	}

	@Override
	public void modify(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		memberDAO.updateMember(member);
	}

	@Override
	public void remove(String id) throws SQLException {
		// TODO Auto-generated method stub
		memberDAO.deleteMember(id);
	}

}
