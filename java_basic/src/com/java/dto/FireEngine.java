package com.java.dto;

public class FireEngine extends Car{
	
	protected int sheel = 10;
	protected int waterTank;
	
	@Override
	public void speedUp() {
		System.out.println("자식 : 스피드업");
	}
	
	@Override
	public void speedDown() {
		System.out.println("자식 스피드 다운");
	}
	
}
