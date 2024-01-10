package com.attetch.spring.service;

import java.sql.SQLException;
import java.util.List;

import com.attetch.spring.dao.AttachDAO;
import com.attetch.spring.dao.PdsDAO;

import attetch.spring.command.PageMaker;
import attetch.spring.dto.AttachVO;
import attetch.spring.dto.PdsVO;

public class PdsServiceImpl implements PdsService {
	PdsDAO pdsDAO;

	public void setPdsDAO(PdsDAO pdsDAO) {
		this.pdsDAO = pdsDAO;
	}

	AttachDAO attachDAO;

	public void setAttachDAO(AttachDAO attachDAO) {
		this.attachDAO = attachDAO;
	}

	@Override
	public List<PdsVO> searchList(PageMaker pageker) throws SQLException {
		// TODO Auto-generated method stub
		List<PdsVO> list = pdsDAO.selectSearchPdsList(pageker);
		if (list != null)
			for (PdsVO i : list) {
				i.setAttachList(attachDAO.selectAttachByPno(i.getPno()));
			}
		return list;
	}

	@Override
	public void regist(PdsVO pds) throws SQLException {
		// TODO Auto-generated method stub
		List<AttachVO> list = pds.getAttachList();
		int pno = pdsDAO.selectPdsSeqNext();
		
		pds.setPno(pno);
		pdsDAO.insertPds(pds);
		if (list != null)
			for (AttachVO i : list) {
				i.setPno(pno);
				attachDAO.insertAttach(i);
			}
				
	}

	@Override
	public PdsVO read(int pno) throws SQLException {
		// TODO Auto-generated method stub
		PdsVO pds = pdsDAO.selectPdsByPno(pno);
		pds.setAttachList(attachDAO.selectAttachByPno(pno));
		return pds;
	}

	@Override
	public void modify(PdsVO pds) throws SQLException {
		// TODO Auto-generated method stub
		List<AttachVO> list =pds.getAttachList();
		int pno = pds.getPno();
		
		pdsDAO.updatePds(pds);
		if(list != null)
			for(AttachVO attach : list) {
				attach.setPno(pno);
				attachDAO.insertAttach(attach);
			}
	}

	@Override
	public void remove(int pno) throws SQLException {
		// TODO Auto-generated method stub
		
//		attachDAO.deleteALLAttach(pno);
//		if(attachDAO.selectAttachByPno(pno) != null)
//			for(AttachVO i : attachDAO.selectAttachByPno(pno)) {
//				attachDAO.deletAttach(i.getAno());
//			}
		pdsDAO.deletePds(pno);
	}

	@Override
	public AttachVO getAttachByAno(int ano) throws SQLException {
		// TODO Auto-generated method stub
		return attachDAO.selectAttachByAno(ano);
	}

	@Override
	public void removeAttachByAno(int ano) throws SQLException {
		// TODO Auto-generated method stub
		attachDAO.deletAttach(ano);
	}
}
