package test1;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 0 ���� 1 �� 2
		Scanner scann = new Scanner(System.in);
		int computerChoice = -1;
		int userChoice = -1;
		String result = " ";
		String Computer;
		String User;

		computerChoice = (int) (Math.random() * 3 + 1);
		if (computerChoice == 1)
			Computer = "����";
		else if (computerChoice == 2)
			Computer = "����";
		else
			Computer = "��";

		System.out.println("[ ���� ���� �� ���� ]");
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.print("����� �����Դϴ�. (���� 1 / ���� 2 / �� 3 )");
		userChoice = scann.nextInt();

		if (userChoice == 1)
			User = "����";
		else if (userChoice == 2)
			User = "����";
		else {
			User = "��";
			userChoice = 3;
		}

		if (computerChoice == userChoice) {
			result = "�����ϴ�.";
		} else {
			userChoice = userChoice + 1;
			if (userChoice > 3) {
				userChoice = userChoice - 3;
			}
			if (computerChoice == userChoice) {
				result = "�����ϴ�.";
			} else {
				result = "�̰���ϴ�.";
			}
		}

		System.out.println("��ǻ�� : " + Computer);
		System.out.println("���� : " + User);
		System.out.println(result);
	}

}
