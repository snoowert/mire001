package java_basic;

import java.util.Scanner;

public class multiplexCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		String result = " ";

		boolean cnt = false;
		System.out.print("������ �Է��Ͻÿ� : ");
		inputInt = scann.nextInt();

		if (inputInt != 0) {
			if (inputInt % 2 == 0) {
				result = result + "2";
				cnt = true;
			}
			if (inputInt % 3 == 0) {
				if(cnt) {
					result = result + ", ";
					cnt = false;
				}
				result = result + "3";
				cnt = true;
			}
			if (inputInt % 5 == 0) {
				if(cnt) {
					result = result + ", ";
					cnt = false;
				}
				result = result + "5 ";
				cnt = true;
			}
		}
		
		if (result != " ") {
			System.out.println(inputInt + "�� "+ result +"�� ��� �Դϴ�.");
		} else {
			System.out.println(inputInt + "�� 2, 3, 5�� ����� ��� �ƴմϴ�.");
		}
	}

}
