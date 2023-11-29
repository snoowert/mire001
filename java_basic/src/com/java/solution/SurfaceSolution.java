package com.java.solution;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.ifc.inputable;
import com.java.ifc.outputable;

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
		inputable inputObject = null;
		switch (menu) {
		case 1:
			inputObject = new TriangleVO();
			
			break;
		case 2:
			inputObject = new RectangularVO();
			
			break;
		case 3:
			inputObject = new CircleVO();
			
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");
			break;
		}
		inputObject.input();
		s = (Shape)inputObject;
		
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
		outputable outputObject = (outputable)s;
		System.out.println(outputObject.output());
		System.out.print("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� ��������.");
		if ((new Scanner(System.in).nextLine()).toUpperCase().equals("Q"))
			System.exit(0);
	}

}
