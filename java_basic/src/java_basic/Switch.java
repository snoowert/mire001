package java_basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 9877;
		System.out.print("���� �Է� : ");
		inputInt = scann.nextInt();

		switch (inputInt % 7) {
		case 0: case 1:
			System.out.println("�������� 0 �Ǵ� 1�Դϴ�.");
			break;
		case 2: case 3:
			System.out.println("�������� 2 �Ǵ� 3�Դϴ�.");
			break;
		case 4:
			System.out.println("�������� 4�Դϴ�.");
		default:
			System.out.println("�������� 5 �Ǵ� 6�Դϴ�.");
			break;

		}
	}

}
