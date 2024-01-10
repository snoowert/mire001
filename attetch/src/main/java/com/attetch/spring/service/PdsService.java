package com.attetch.spring.service;

import java.sql.SQLException;
import java.util.List;

import attetch.spring.command.PageMaker;
import attetch.spring.dto.AttachVO;
import attetch.spring.dto.PdsVO;

public interface PdsService {

	//목록
	List<PdsVO> searchList(PageMaker pageker) throws SQLException;
	
	//등록
	void regist(PdsVO pds)throws SQLException;
	
	//읽기
	PdsVO read(int pno) throws SQLException;
	
	//수정
	void modify(PdsVO pds) throws SQLException;
	
	//삭제
	void remove(int pno) throws SQLException;
	
	//파일조회
	AttachVO getAttachByAno(int ano)throws SQLException;
	
	//파일삭제
	void removeAttachByAno(int ano)throws SQLException;
}





