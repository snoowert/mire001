package com.java.dto;

import java.util.Scanner;

public class ScoreVO {

	public String name;
	int num;
	public int math;
	public int kor;
	public int eng;
	public int scien;
	Scanner scann = new Scanner(System.in);

	public int total() {
		return kor + eng + scien + math;
	}

	public float evg() {
		return ((int) (total() / 4f * 100 + 0.5)) / 100f;
	}

	public void inputScore(int number) {
		num = number;
		System.out.print("이름 : ");
		name = scann.nextLine();
		System.out.print("국어 : ");
		kor = scann.nextInt();
		System.out.print("영어 : ");
		eng = scann.nextInt();
		System.out.print("수학 : ");
		math = scann.nextInt();
		System.out.print("과학 : ");
		scien = scann.nextInt();
		scann.nextLine();
	}
	
	public static void printLabel() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}
	public void printScore() {
		System.out.print(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math
				+ "\t" + scien + "\t");
		System.out.println(total() + "\t" + evg());
	}
}
