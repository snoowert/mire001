package com.java.dto;

import java.util.Scanner;

public class TriangleVO extends Shape {
	// 명시적 초기화
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
		System.out.print("밑변 : ");
		setBase(scann.nextInt());
		scann.nextLine();
		System.out.print("높이 : ");
		setHeight(scann.nextInt());
		scann.nextLine();
	}

	@Override
	public String outputMasage() {
		// TODO Auto-generated method stub
		return "삼각형의 넓이 : " + surface();
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
//	//블럭 초기화
//	{
//		height = 1;
//		baseLine = 1;
//	}
//	//생성자 초기화
//	public TriangleVO() {
//		height = 1;
//		baseLine = 1;
//	}
//	
//	public TriangleVO(int height, int baseLine) {
//		this.height = height;
//		this.baseLine = baseLine;
//	}
//	/* 타입이 같으면 변수 이름이 달라도 같음.
//	public TriangleVO(int b, int a) {
//		
//	}
//	*/
//	public TriangleVO(int height, float baseLine) {
//		
//	}
//	//타입이 다르면 순서가 다를 때 같지 않음
//	public TriangleVO(float baseLine, int height) {
//		
//	}
}
