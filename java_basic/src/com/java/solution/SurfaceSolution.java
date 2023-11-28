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
		System.out.println("도형을 선택하시오");
		System.out.print("1.삼각형 2.사각형 3.원 : ");
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
			System.out.println("입력이 올바르지 않습니다.");
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
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);

		}

	}

	public void output() {
		System.out.println(s.outputMasage());
		System.out.print("종료(Q) 혹은 계속하시려면 아무키나 누르세요.");
		if ((new Scanner(System.in).nextLine()).toUpperCase().equals("Q"))
			System.exit(0);
	}

}
