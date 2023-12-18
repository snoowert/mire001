package com.java.dto;

import java.text.SimpleDateFormat;
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
	private int stuNum;
	Scanner scann = new Scanner(System.in);

	public int getNum() {
		return num;
	}
	
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
		System.out.print("학번 : ");
		num = scann.nextInt();
		scann.nextLine();
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
		SimpleDateFormat stdFormat = new SimpleDateFormat("yyyy.MM.dd");
		String regDate = stdFormat.format(scoreDay);
		String today = stdFormat.format(new Date());
		if (regDate.equals(today)) {
			regDate = new SimpleDateFormat("HH:mm:ss").format(this.scoreDay);
		}
		System.out.print(num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + scien + "\t");
		System.out.print(total() + "\t" + evg());
		System.out.println("\t" + regDate);

	}

	@Override
	public int compareTo(ScoreVO o) {
		if (this.num == o.num) {
			return 0;
		} else {
			return o.scoreDay.compareTo(this.scoreDay);
		}
	}
}
