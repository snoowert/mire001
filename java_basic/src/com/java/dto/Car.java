package com.java.dto;

public class Car {
	protected int wheel;
	protected int breakk;
	protected int accel;
	
	
	public void speedUp() {
		System.out.println("부모 스피드 업");
	}
	public void speedDown() {
		System.out.println("부모 스피드 다운");
	}
}
