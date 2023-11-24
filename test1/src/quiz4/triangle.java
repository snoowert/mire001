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
		System.out.print("삼각형의 밑변의 길이 : ");
		width = scann.nextInt();
		System.out.print("삼각형의 높이의 길이 : ");
		height = scann.nextInt();
	}

	void outputData() {
		System.out.println("삼각형의 넓이 : " + area());
	}

}
