package test1;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputTax; // �Է� �ݾ�
		int lottoCnt; // ���� �ζ� ����
		int change; // �ܵ�
		int[][] lottoNum;

		System.out.println("�ζ� 1000���� �� ��");
		System.out.print("���� �ݾ� : ");
		inputTax = scann.nextInt();
		lottoCnt = inputTax / 1000;
		change = inputTax % 1000;
		lottoNum = new int[lottoCnt][6];

		for (int i = 0; i < lottoCnt; i++) {
			for (int j = 0; j < lottoNum[i].length; j++) {
				lottoNum[i][j] = (int) (Math.random() * 45 + 1);
				for (int k = 0; k < j; k++) { // �ߺ� �˻�
					if (lottoNum[i][k] == lottoNum[i][j]) {
						j--;
						break;
					}
				}
			}
		}

		for (int i = 0; i < lottoCnt; i++) {
			for (int j = 0; j < lottoNum[i].length; j++) {
				System.out.print(lottoNum[i][j] + "  ");
			}
			System.out.println();
		}
		if (change > 0) {
			System.out.println();
			System.out.println("�ܵ� : " + change + "��");
		}
	}

}
