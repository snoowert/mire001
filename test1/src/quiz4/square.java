package quiz4;

import java.util.Scanner;

public class square {
	int length;
	int height;

	Scanner scann = new Scanner(System.in);
	
	int area() {
		return length * height;
	}

	void inputData() {
		System.out.print("사각형의 가로의 길이 : ");
		length = scann.nextInt();
		System.out.print("사각형의 세로의 길이 : ");
		height = scann.nextInt();
	}

	void outputData() {
		System.out.println("사각형의 넓이 : " + area());
	}

}
