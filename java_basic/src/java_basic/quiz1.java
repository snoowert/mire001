package java_basic;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		int saveInt = 0; 		//�Էµ� ���� �����ϱ� ���� ���� ����
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		
		System.out.print("4�ڸ� ���� �Է� : ");
		inputInt = scann.nextInt();
		saveInt = inputInt;
		firstNumber = saveInt % 10;
		saveInt = saveInt / 10;
		secondNumber = saveInt % 10;
		saveInt = saveInt / 10;
		thirdNumber = saveInt % 10;
		saveInt = saveInt / 10;
		fourthNumber = saveInt;
		
		
		System.out.println("4��° �ڸ� �� : " + fourthNumber);
		System.out.println("3��° �ڸ� �� : " + thirdNumber);
		System.out.println("2��° �ڸ� �� : " + secondNumber);
		System.out.println("1��° �ڸ� �� : " + firstNumber);
	}

}
