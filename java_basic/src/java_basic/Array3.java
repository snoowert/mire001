package java_basic;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		final int stuNum;
		final int subjectNum;
		String[] name;
		String[] subject;
		int[][] score;
		float[] avg;

		System.out.print("�л� �� �Է� : ");
		stuNum = scann.nextInt();
		System.out.print("���� �� �Է� : ");
		subjectNum = scann.nextInt();
		scann.nextLine();

		name = new String[stuNum];
		score = new int[stuNum][subjectNum+2];
		avg = new float[stuNum];
		subject = new String[subjectNum];
		
		for(int i = 0; i < subjectNum; i++) { //���� �̸� �Է�
			System.out.print("���� �Է� : ");
			subject[i] = scann.nextLine();
		}
		
		for(int i = 0; i < stuNum; i++) { //�л� ���� �Է�
			System.out.println("�л� " + (i+1) + " ���� �Է�");
			score[i][0] = i+1; 
			System.out.print("�̸� : ");
			name[i] = scann.nextLine();
			System.out.println(subjectNum + "���� ���� �Է�");
			for(int j = 1; j <= subjectNum; j++) {
				System.out.print(subject[j-1]+" : ");
				score[i][j] = scann.nextInt();
				score[i][score[i].length-1] = score[i][score[i].length-1] + score[i][j]; //���� ���
			}
			scann.nextLine();
			avg[i] = (int)((score[i][score[i].length-1] / (float)subjectNum) * 100 + 0.5f ) / 100f; // ��հ��
			System.out.println();
		}
		
		System.out.print("��ȣ\t �̸�\t ");
		for(int i = 0; i < subjectNum; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println("����\t ���");
		for(int i = 0; i < stuNum; i++) {
			System.out.print(score[i][0] + "\t");
			System.out.print(name[i] + "\t");
			for(int j = 1; j<score[i].length; j++) {
				System.out.print(score[i][j]+ "\t");
			}
			System.out.println(avg[i]);
		}
		
	}

}
