package java_basic;

import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		// ���� 0 ���� 1 �� 2
		String com_rsp = "";
		int com_rsp_num = 0;
		String user_rsp = "";
		int user_rsp_num = 0;
		int menu = 0;
		// �¸� 2 ��� 1 �й� 0
		String judge = "";

		com_rsp_num = (int) (Math.random() * 3);
		System.out.println("��ǻ�ʹ� �����߽��ϴ�.");
		System.out.println("����� ������?");
		System.out.println("1.���� 2.���� 3.��");
		System.out.print(" : ");
		menu = scann.nextInt();
		user_rsp_num = menu - 1;

		switch (com_rsp_num) {
		case 0:
			com_rsp = "����";
			break;
		case 1:
			com_rsp = "����";
			break;
		case 2:
			com_rsp = "��";
			break;
		default:
			break;
		}

		switch (user_rsp_num) {
		case 0:
			user_rsp = "����";
			break;
		case 1:
			user_rsp = "����";
			break;
		case 2:
			user_rsp = "��";
			break;
		default:
			break;
		}

		if (com_rsp_num == ((user_rsp_num + 1) % 3)) {
			judge = "�����ϴ�.";
		} else if (com_rsp_num == user_rsp_num) {
			judge = "�����ϴ�.";
		} else {
			judge = "�̰���ϴ�.";
		}

		System.out.println("��ǻ�� : " + com_rsp);
		System.out.println("���� : " + user_rsp);
		System.out.println(judge);
	}
}
