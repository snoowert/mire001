package java_basic;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		
		System.out.print("4�ڸ� ���� �Է� : ");
		inputInt = scann.nextInt();
		
		firstNumber = inputInt % 10;
		inputInt = inputInt / 10;
		secondNumber = inputInt % 10;
		inputInt = inputInt / 10;
		thirdNumber = inputInt % 10;
		inputInt = inputInt / 10;
		fourthNumber = inputInt;
		
		
		System.out.println("4��° �ڸ� �� : " + fourthNumber);
		System.out.println("3��° �ڸ� �� : " + thirdNumber);
		System.out.println("2��° �ڸ� �� : " + secondNumber);
		System.out.println("1��° �ڸ� �� : " + firstNumber);
	}

}
