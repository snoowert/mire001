package com.java.dto;

public class TriangleVO {
	// ����� �ʱ�ȭ
	public int height;
	public int baseLine;

	{
		int temp = (int)( Math.random() * 11);
		height = baseLine = (temp % 2 == 0) ? 0 : 1;
	}

	public TriangleVO() {

	}

	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}
	
	public int surface() {
		return baseLine * height / 2;
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
