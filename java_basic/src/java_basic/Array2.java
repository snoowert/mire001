package java_basic;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Label = { "����", "�̸�", "����", "����", "����", "����", "����", "���" };
		
		String[] name;
		int[] kor;
		int[] eng;
		int[] math;
		int[] scien;
		int[] total;
		float[] avg;

		Scanner scann = new Scanner(System.in);
		final int stuCnt;
		System.out.print("�л� �� �Է� : ");
		stuCnt = scann.nextInt();
		scann.nextLine();
		
		int[] num = new int[stuCnt];
		name = new String[stuCnt];
		kor = new int[stuCnt];
		eng = new int[stuCnt];
		math = new int[stuCnt];
		scien = new int[stuCnt];
		total = new int[stuCnt];
		avg = new float[stuCnt];
		
		for (int i = 0; i < stuCnt; i++) {
			num[i] = i + 1;
			System.out.println("�л� " + (i + 1) + " ���� �Է�");
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();
			System.out.print("���� : ");
			kor[i] = scann.nextInt();
			System.out.print("���� : ");
			eng[i] = scann.nextInt();
			System.out.print("���� : ");
			math[i] = scann.nextInt();
			System.out.print("���� : ");
			scien[i] = scann.nextInt();
			scann.nextLine();
		}

		for (int i = 0; i < stuCnt; i++) {
			total[i] = kor[i] + eng[i] + math[i] + scien[i];
			avg[i] = (int) ((total[i] / (float) (Label.length - 4)) * 100 + 0.5f) / 100f;
		}

		// ���
		for (int i = 0; i < Label.length; i++) {
			System.out.print(Label[i] + "\t");
			for (int j = 0; j < stuCnt; j++) {
				switch (i) {
				case 0:
					System.out.print(num[j] + "\t\t");
					break;
				case 1:
					System.out.print(name[j] + "\t\t");
					break;
				case 2:
					System.out.print(kor[j] + "\t\t");
					break;
				case 3:
					System.out.print(eng[j] + "\t\t");
					break;
				case 4:
					System.out.print(math[j] + "\t\t");
					break;
				case 5:
					System.out.print(scien[j] + "\t\t");
					break;
				case 6:
					System.out.print(total[j] + "\t\t");
					break;
				case 7:
					System.out.print(avg[j] + "\t\t");
					break;
				}
			}
			System.out.println();
		}

	}

}
