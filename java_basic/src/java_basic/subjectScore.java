package java_basic;

import java.util.Scanner;

public class subjectScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int science = 0;
		
		int total = 0;
		float evg = 0f;
		
		System.out.print("국어 점수 입력 : ");
		kor = scann.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = scann.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = scann.nextInt();
		System.out.print("과학 점수 입력 : ");
		science = scann.nextInt();
		
		total = kor + eng + math + science;
		evg = total / 4f;
	
		evg = (int)((evg * 100 + 5) / 10) / 10f;
		
		System.out.println("국어\t영어\t수학\t과학\t총점\t평균");
		System.out.printf(" %d\t %d\t %d\t %d\t%d\t%1.2f\n",kor, eng, math, science, total, evg);
		//System.out.println(kor+"\t"+eng+"\t"+math+"\t"+science+"\t"+total+"\t"+evg);
	}
	
}
