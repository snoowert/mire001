package com.java.dto;

import java.util.Scanner;

import com.java.ifc.inputable;
import com.java.ifc.outputable;

public class CircleVO extends Shape implements inputable, outputable{

	public int radius;

	public CircleVO() {

	}

	public CircleVO(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int surface() {
		return (int) (radius * radius * Math.PI);
	}

	@Override
	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.print("반지름 : ");
		setRadius(scann.nextInt());
		scann.nextLine();
	}

	@Override
	public String output() {
		return "원의 넓이 : " + surface();
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}
