package quiz4;

import java.util.Scanner;

public class circle {
	int length;
	Scanner scann = new Scanner(System.in);

	float area() {
		return (int) (length * length * Math.PI * 100f + 0.5) / 100f;
	}

	void inputData() {
		System.out.print("원의 반지름의 길이 : ");
		length = scann.nextInt();
	}

	void outputData() {
		System.out.println("원의 넓이 : " + area());
	}

}
