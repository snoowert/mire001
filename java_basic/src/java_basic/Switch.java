package java_basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 9877;
		System.out.print("정수 입력 : ");
		inputInt = scann.nextInt();

		switch (inputInt % 7) {
		case 0: case 1:
			System.out.println("나머지가 0 또는 1입니다.");
			break;
		case 2: case 3:
			System.out.println("나머지가 2 또는 3입니다.");
			break;
		case 4:
			System.out.println("나머지가 4입니다.");
		default:
			System.out.println("나머지가 5 또는 6입니다.");
			break;

		}
	}

}
