package com.java.solution;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;

public class SurfaceSolution {

	private Shape s;

	private int menu;

	public void start() {
		do {
			input();
			process();
			output();
		} while (true);
	}

	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("������ �����Ͻÿ�");
		System.out.print("1.�ﰢ�� 2.�簢�� 3.�� : ");
		menu = scann.nextInt();
		scann.nextLine();
		switch (menu) {
		case 1:
			s = new TriangleVO();
			s.inputData();
			break;
		case 2:
			s = new RectangularVO();
			s.inputData();
			break;
		case 3:
			s = new CircleVO();
			s.inputData();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			break;
		}
		
	}

	public void process() {
		switch (menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);

		}

	}

	public void output() {
		System.out.println(s.outputMasage());
		System.out.print("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� ��������.");
		if ((new Scanner(System.in).nextLine()).toUpperCase().equals("Q"))
			System.exit(0);
	}

}
