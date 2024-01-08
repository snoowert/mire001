package com.spring.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MemberDAO;
import com.spring.dto.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/spring/context/root-context.xml")
@Transactional
public class TestMemberDAOimpl {
	@Autowired
	private MemberDAO memberDAO;

	@Test
	public void testSelectMemberList() throws Exception {
		List<MemberVO> memberList = memberDAO.selectMemberList();

		Assert.assertEquals(7, memberList.size());
	}

	@Test
	public void testSelectMemeberById() throws Exception {
		String testid = "mimi";
		MemberVO member = memberDAO.selectMemberById(testid);
		Assert.assertEquals(member.getId(), testid);
	}

	String insertId="koko";
	@Test
	@Rollback
	public void testInsertMember() throws Exception {
		MemberVO member = new MemberVO();
		member.setId(insertId);
		member.setPwd("koko");
		member.setAddress("koko");
		member.setAuthority("RULE_USER");
		member.setEmail("koko");
		member.setName("koko");
		member.setPhone("01012345678");
		member.setPicture("myImg.jpg");
		memberDAO.insertMember(member);

		MemberVO getMem = memberDAO.selectMemberById(member.getId());

		Assert.assertEquals(member.getId(), getMem.getId());
	}

	@Test
	@Rollback
	public void testUpdateMember() throws Exception {
		String testId = "mimi";
		String testName = "lalala";
		MemberVO targetMember = memberDAO.selectMemberById(testId);
		Assert.assertNotEquals(testName, targetMember.getName());
		targetMember.setName("lalala");
		memberDAO.updateMember(targetMember);

		MemberVO getMem = memberDAO.selectMemberById(testId);

		Assert.assertEquals(testName, getMem.getName());
	}

	@Test
	@Rollback
	public void testDeleteMember() throws Exception {
		testInsertMember();
		MemberVO targetMember = memberDAO.selectMemberById(insertId);

		Assert.assertEquals(insertId, targetMember.getId());
		
		memberDAO.deleteMember(insertId);
		
		MemberVO deletedMember = memberDAO.selectMemberById(insertId);
		Assert.assertNull(deletedMember);
	}

}
