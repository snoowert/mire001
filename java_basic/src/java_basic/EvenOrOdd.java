package java_basic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		char judge = ' ';
		System.out.print("���� �ϳ��� �Է��Ͻÿ�. : ");
		inputInt = scann.nextInt();
		
		if(inputInt % 2 == 0)
			judge = '¦';
		else
			judge = 'Ȧ';
			
		System.out.println("�Է��� ���� " + inputInt +"�� "+ judge +"���Դϴ�.");
	}

}
