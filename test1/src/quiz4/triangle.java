package quiz4;

import java.util.Scanner;

public class triangle {
	int length;
	int height;
	Scanner scann = new Scanner(System.in);
	float area() {
		return length * height / 2;
	}

	void inputData() {
		System.out.print("�ﰢ���� �غ��� ���� : ");
		length = scann.nextInt();
		System.out.print("�ﰢ���� ������ ���� : ");
		height = scann.nextInt();
	}

	void outputData() {
		System.out.println("�ﰢ���� ���� : " + area());
	}

}
