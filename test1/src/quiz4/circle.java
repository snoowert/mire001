package quiz4;

import java.util.Scanner;

public class circle {
	int width;
	Scanner scann = new Scanner(System.in);

	float area() {
		return (int) (width * width * Math.PI * 100f + 0.5) / 100f;
	}

	void inputData() {
		System.out.print("���� �������� ���� : ");
		width = scann.nextInt();
	}

	void outputData() {
		System.out.println("���� ���� : " + area());
	}

}
