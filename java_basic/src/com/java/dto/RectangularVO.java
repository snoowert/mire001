package com.java.dto;

import java.util.Scanner;

public class RectangularVO extends Shape {
	public int width;
	public int height;

	public RectangularVO() {

	}

	public RectangularVO(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public int surface() {
		return width * height;
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		System.out.print("가로 : ");
		setWidth(scann.nextInt());
		scann.nextLine();
		System.out.print("세로 : ");
		setHeight(scann.nextInt());
		scann.nextLine();
	}

	@Override
	public String outputMasage() {
		// TODO Auto-generated method stub
		return "사각형의 넓이 : " + surface();
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
}
