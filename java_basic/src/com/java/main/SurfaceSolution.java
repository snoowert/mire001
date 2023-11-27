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
		System.out.println("도형을 선택하시오");
		System.out.print("1.삼각형 2.사각형 3.원 : ");
		menu = scann.nextInt();
		scann.nextLine();
		switch (menu) {
		case 1:
			triangle = new TriangleVO();
			System.out.print("밑변 : ");
			triangle.baseLine = scann.nextInt();
			scann.nextLine();
			System.out.print("높이 : ");
			triangle.height = scann.nextInt();
			scann.nextLine();
			break;
		case 2:
			rectangular = new RectangularVO();
			System.out.print("가로 : ");
			rectangular.width = scann.nextInt();
			scann.nextLine();
			System.out.print("세로 : ");
			rectangular.height = scann.nextInt();
			scann.nextLine();
			break;
		case 3:
			circle = new CircleVO();
			System.out.print("반지름 : ");
			circle.radius = scann.nextInt();
			scann.nextLine();
			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
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
			System.out.println("삼각형의 넓이 : ");
			break;
		case 2:
			System.out.println("사각형의 넓이 : ");
			break;
		case 3:
			System.out.println("원의 넓이 : ");
			break;
		}
		System.out.print("다시 하시겠습니까?(종료 : Q) : ");
		if((new Scanner(System.in).nextLine()).toUpperCase() == "Q")
			System.exit(PolyMain);
	}

}
