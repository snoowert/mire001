package com.java.dto;

public class FireEngine extends Car{
	
	protected int sheel = 10;
	protected int waterTank;
	
	@Override
	public void speedUp() {
		System.out.println("�ڽ� : ���ǵ��");
	}
	
	@Override
	public void speedDown() {
		System.out.println("�ڽ� ���ǵ� �ٿ�");
	}
	
}
