package com.spring.attach;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.attetch.spring.dao.AttachDAO;
import com.attetch.spring.dao.PdsDAO;

import attetch.spring.command.PageMaker;
import attetch.spring.dto.PdsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/spring/context/root-context.xml")
@Transactional
public class testPdsDAO {
	@Autowired
	PdsDAO pdsDAO;
	@Autowired
	AttachDAO attachdDAO;

	@Test
	public void testSelectPdsList() throws Exception {
		PageMaker pageMaker = new PageMaker();
		List<PdsVO> pdslist = pdsDAO.selectSearchPdsList(pageMaker);
		
		Assert.assertEquals(12273, pdslist.size());
	}
}
