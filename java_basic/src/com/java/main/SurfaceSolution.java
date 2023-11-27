package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.TriangleVO;

public class SurfaceSolution {

	private TriangleVO triangle;
	private CircleVO circle;
	private RectangularVO rectangular;
	private int menu;
	
	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("������ �����Ͻÿ�");
		System.out.print("1.�ﰢ�� 2.�簢�� 3.�� : ");
		menu = scann.nextInt();
		scann.nextLine();
		switch (menu) {
		case 1:
			triangle = new TriangleVO();
			System.out.print("�غ� : ");
			triangle.baseLine = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			triangle.height = scann.nextInt();
			scann.nextLine();
			break;
		case 2:
			rectangular = new RectangularVO();
			System.out.print("���� : ");
			rectangular.width = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			rectangular.height = scann.nextInt();
			scann.nextLine();
			break;
		case 3:
			circle = new CircleVO();
			System.out.print("������ : ");
			circle.radius = scann.nextInt();
			scann.nextLine();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			break;

		}
	}

	public void process() {
		switch (menu) {
		case 1:
			triangle.surface();
			break;
		case 2:
			rectangular.surface();
			break;
		case 3:
			circle.surface();
			break;

		}

	}

	public void output() {
		switch (menu) {
		case 1:
			System.out.println("�ﰢ���� ���� : ");
			break;
		case 2:
			System.out.println("�簢���� ���� : ");
			break;
		case 3:
			System.out.println("���� ���� : ");
			break;
		}
		System.out.print("�ٽ� �Ͻðڽ��ϱ�?(���� : Q) : ");
		if((new Scanner(System.in).nextLine()).toUpperCase() == "Q")
			System.exit(PolyMain);
	}

}
