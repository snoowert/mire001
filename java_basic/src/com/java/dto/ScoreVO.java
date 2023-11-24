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
		System.out.print("�̸� : ");
		name = scann.nextLine();
		System.out.print("���� : ");
		kor = scann.nextInt();
		System.out.print("���� : ");
		eng = scann.nextInt();
		System.out.print("���� : ");
		math = scann.nextInt();
		System.out.print("���� : ");
		scien = scann.nextInt();
		scann.nextLine();
	}
	
	public static void printLabel() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t����\t���");
	}
	public void printScore() {
		System.out.print(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math
				+ "\t" + scien + "\t");
		System.out.println(total() + "\t" + evg());
	}
}
