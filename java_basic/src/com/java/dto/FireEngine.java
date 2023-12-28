package com.java.dto;

public class FireEngine extends Car{
	
	protected int sheel = 10;
	protected int waterTank;
	
	@Override
	public void speedUp() {
		System.out.println("�ڽ� : �7��ǵ��");
	}
	
	@Override
	public void speedDown() {
		System.out.println("�ڽ� ���ǵ7� �ٿ�");
	}
	
}
