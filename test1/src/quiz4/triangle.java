package quiz4;

import java.util.Scanner;

public class triangle {
	int width;
	int height;
	Scanner scann = new Scanner(System.in);
	float area() {
		return width * height / 2;
	}

	void inputData() {
		System.out.print("�ﰢ���� �غ��� ���� : ");
		width = scann.nextInt();
		System.out.print("�ﰢ���� ������ ���� : ");
		height = scann.nextInt();
	}

	void outputData() {
		System.out.println("�ﰢ���� ���� : " + area());
	}

}
