package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENT_NUM;
//		ScoreVO s = new ScoreVO();
		Scanner scann = new Scanner(System.in);

		System.out.print("�л� �� : ");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		ScoreVO[] ss = new ScoreVO[STUDENT_NUM];

		for (int i = 0; i < STUDENT_NUM; i++) {
			ss[i] = new ScoreVO();
			System.out.println("�л� " + (i + 1) + "�� ���� �Է�");
			ss[i].inputScore(i+1);
		}
		ScoreVO.printLabel();	
		for (int i = 0; i < STUDENT_NUM; i++) {
			ss[i].printScore();
		}
//		System.out.println("���� : " + s.total());
//		System.out.println("��� : " + s.evg());
	}
}
