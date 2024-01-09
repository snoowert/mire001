package com.spring.command;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.MemberVO;

public class MemberRegistCommand {

	private String id;
	private String pwd;
	private String name;
	private String[] phone;
	private String email;
	private MultipartFile picture;
	private String authority;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MultipartFile getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public MemberVO toMemberVO() {
		MemberVO member = new MemberVO();
		member.setEmail(email);
		member.setAuthority(authority);
		member.setEnabled(1);
		member.setId(id);
		member.setName(name);
		member.setPwd(pwd);
		member.setRegDate(new Date());
		String phoneTemp = "";
		for (String p : phone ) {
			phoneTemp += p;
		}
		member.setPhone(phoneTemp);

		return member;
	}
}
