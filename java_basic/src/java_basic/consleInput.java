package java_basic;

import java.util.Scanner;

public class consleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scann = new Scanner(System.in);
			
//			scann.nextInt(); //���� �Է�
//			scann.nextFloat(); //�Ǽ� �Է�
			
			System.out.print("������ �Է� : ");
			int inputInt = scann.nextInt();
			System.out.print("�Ǽ��� �Է� : ");
			float inputFloat = scann.nextFloat();
			System.out.println();
			
			
			System.out.println("�Է��� ���� : "+ inputInt);
			System.out.println("�Է��� �Ǽ� : "+ inputFloat);
	}

}
