package com.attetch.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import attetch.spring.dto.AttachVO;
import attetch.spring.dto.PdsVO;

public class AttachDAOImpl implements AttachDAO {
	SqlSession session;

	public void setSqlSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<AttachVO> selectAttachByPno(int pno) throws SQLException {
		// TODO Auto-generated method stub
		return session.selectList("Attach-Mapper.selectAttachByPno", pno);
	}

	@Override
	public AttachVO selectAttachByAno(int ano) throws SQLException {
		// TODO Auto-generated method stub
		return session.selectOne("Attach-Mapper.selectAttachByAno", ano);
	}

	@Override
	public void insertAttach(AttachVO attach) throws SQLException {
		// TODO Auto-generated method stub
		session.insert("Attach-Mapper.insertAttach", attach);
	}

	@Override
	public void deletAttach(int ano) throws SQLException {
		// TODO Auto-generated method stub
		session.delete("Attach-Mapper.deleteAttach", ano);
	}

	@Override
	public void deletAllAttach(int pno) throws SQLException {
		// TODO Auto-generated method stub
		session.delete("Attach-Mapper.deleteAllAttach", pno);
	}

}
