package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENT_NUM;
//		ScoreVO s = new ScoreVO();
		Scanner scann = new Scanner(System.in);

		System.out.print("학생 수 : ");
		STUDENT_NUM = scann.nextInt();
		scann.nextLine();
		ScoreVO[] ss = new ScoreVO[STUDENT_NUM];

		for (int i = 0; i < STUDENT_NUM; i++) {
			ss[i] = new ScoreVO();
			System.out.println("학생 " + (i + 1) + "의 정보 입력");
			ss[i].inputScore(i+1);
		}
		ScoreVO.printLabel();	
		for (int i = 0; i < STUDENT_NUM; i++) {
			ss[i].printScore();
		}
//		System.out.println("총점 : " + s.total());
//		System.out.println("평균 : " + s.evg());
	}
}
