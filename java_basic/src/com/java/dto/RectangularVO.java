package com.java.dto;

public class RectangularVO {
	public int width;
	public int height;
	
	public RectangularVO() {

	}

	public RectangularVO(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int surface() {
		return width * height;
	}
}
