package quiz4;

import java.util.Scanner;

public class square {
	int width;
	int height;

	Scanner scann = new Scanner(System.in);
	
	int area() {
		return width * height;
	}

	void inputData() {
		System.out.print("�簢���� ������ ���� : ");
		width = scann.nextInt();
		System.out.print("�簢���� ������ ���� : ");
		height = scann.nextInt();
	}

	void outputData() {
		System.out.println("�簢���� ���� : " + area());
	}

}
