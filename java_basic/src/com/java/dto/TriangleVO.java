package com.java.dto;

import java.util.Scanner;

public class TriangleVO extends Shape {
	// ����� �ʱ�ȭ
	public int height;
	public int baseLine;

	{
		int temp = (int) (Math.random() * 11);
		height = baseLine = (temp % 2 == 0) ? 0 : 1;
	}

	public TriangleVO() {

	}

	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}

	@Override
	public int surface() {
		return (int) (baseLine * height / 2);
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		System.out.print("�غ� : ");
		setBase(scann.nextInt());
		scann.nextLine();
		System.out.print("���� : ");
		setHeight(scann.nextInt());
		scann.nextLine();
	}

	@Override
	public String outputMasage() {
		// TODO Auto-generated method stub
		return "�ﰢ���� ���� : " + surface();
	}

	public void setBase(int baseLine) {
		this.baseLine = baseLine;
	}

	public int getBase() {
		return baseLine;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
//	//�� �ʱ�ȭ
//	{
//		height = 1;
//		baseLine = 1;
//	}
//	//������ �ʱ�ȭ
//	public TriangleVO() {
//		height = 1;
//		baseLine = 1;
//	}
//	
//	public TriangleVO(int height, int baseLine) {
//		this.height = height;
//		this.baseLine = baseLine;
//	}
//	/* Ÿ���� ������ ���� �̸��� �޶� ����.
//	public TriangleVO(int b, int a) {
//		
//	}
//	*/
//	public TriangleVO(int height, float baseLine) {
//		
//	}
//	//Ÿ���� �ٸ��� ������ �ٸ� �� ���� ����
//	public TriangleVO(float baseLine, int height) {
//		
//	}
}
