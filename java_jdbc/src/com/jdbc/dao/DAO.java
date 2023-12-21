package com.jdbc.dao;

import java.util.List;

import com.jdbc.dto.VO;

public interface DAO<E extends VO> {
	List<E> selectList() throws Exception;

	E selectById() throws Exception;

	void insert(E e) throws Exception;

	void update(E e) throws Exception;

	void delete(String e) throws Exception;
}
