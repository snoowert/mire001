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

		System.out.print("학생 수 입력 : ");
		stuNum = scann.nextInt();
		System.out.print("과목 수 입력 : ");
		subjectNum = scann.nextInt();
		scann.nextLine();

		name = new String[stuNum];
		score = new int[stuNum][subjectNum+2];
		avg = new float[stuNum];
		subject = new String[subjectNum];
		
		for(int i = 0; i < subjectNum; i++) { //과목 이름 입력
			System.out.print("과목 입력 : ");
			subject[i] = scann.nextLine();
		}
		
		for(int i = 0; i < stuNum; i++) { //학생 정보 입력
			System.out.println("학생 " + (i+1) + " 정보 입력");
			score[i][0] = i+1; 
			System.out.print("이름 : ");
			name[i] = scann.nextLine();
			System.out.println(subjectNum + "개의 성적 입력");
			for(int j = 1; j <= subjectNum; j++) {
				System.out.print(subject[j-1]+" : ");
				score[i][j] = scann.nextInt();
				score[i][score[i].length-1] = score[i][score[i].length-1] + score[i][j]; //총점 계산
			}
			scann.nextLine();
			avg[i] = (int)((score[i][score[i].length-1] / (float)subjectNum) * 100 + 0.5f ) / 100f; // 평균계산
			System.out.println();
		}
		
		System.out.print("번호\t 이름\t ");
		for(int i = 0; i < subjectNum; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println("총합\t 평균");
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
