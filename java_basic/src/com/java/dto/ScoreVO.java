package com.java.dto;

import java.util.Date;
import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO> {

	private String name;
	int num;
	private int math;
	private int kor;
	private int eng;
	private int scien;
	private Date scoreDay;
	Scanner scann = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public Date GetDate() {
		return scoreDay;
	}

	public int getMath() {
		return math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getScien() {
		return scien;
	}

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
		scoreDay = new Date();
	}

	public static void printLabel() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}

	public void printScore() {
		System.out.print(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + scien + "\t");
		System.out.print(total() + "\t" + evg());
		System.out.println("\t" + scoreDay);
	}

	@Override
	public int compareTo(ScoreVO o) {
		return this.name.compareTo(o.getName());
	}
}
