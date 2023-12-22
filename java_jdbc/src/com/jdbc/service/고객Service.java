package com.jdbc.service;

import java.util.List;

import com.jdbc.dao.DAO;
import com.jdbc.dao.고객DAO;
import com.jdbc.dto.고객VO;

public class 고객Service implements Service<고객VO> {

	DAO dao = new 고객DAO();

	public void setDAO(DAO dao) {
		this.dao = dao;
	}

	@Override
	public List<고객VO> list() throws Exception {
		// TODO Auto-generated method stub
		List<고객VO> 고객리스트 = dao.selectList();
		return 고객리스트;
	}

	@Override
	public 고객VO detail(String id) throws Exception {
		// TODO Auto-generated method stub
		고객VO 고객 = (고객VO) (dao.selectById(id));
		return 고객;
	}

	@Override
	public void regist(고객VO e) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(e);

	}

	@Override
	public void modify(고객VO e) throws Exception {
		// TODO Auto-generated method stub
		dao.update(e);
	}

	@Override
	public void remove(String id) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
