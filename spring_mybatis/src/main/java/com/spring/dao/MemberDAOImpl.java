package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private SqlSession session;

	public void setSqlSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<MemberVO> selectMemberList() throws SQLException {
		// TODO Auto-generated method stub
		return session.selectList("Member-Mapper.selectMemberList");
	}

	@Override
	public MemberVO selectMemberById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return session.selectOne("Member-Mapper.selectMemberById", id);
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		session.insert("Member-Mapper.insertMember", member);
	}

	@Override
	public void updateMember(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		session.update("Member-Mapper.updateMember", member);
	}

	@Override
	public void deleteMember(String id) throws SQLException {
		// TODO Auto-generated method stub
		session.delete("Member-Mapper.deleteMember", id);
	}

}
