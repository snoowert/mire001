package java_basic;

import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		float inputFloat;
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		float saveFloat;
		
		System.out.print("�Ҽ��� �� �ڸ� �Ǽ� �Է� : ");
		inputFloat = scann.nextFloat();
		saveFloat = inputFloat;
		saveFloat = saveFloat - (int)saveFloat;
		
		saveFloat = saveFloat * 10;
		firstNumber = (int)saveFloat;
		saveFloat = saveFloat - (int)saveFloat;
		
		saveFloat = saveFloat * 10;
		secondNumber = (int)saveFloat;
		saveFloat = saveFloat - (int)saveFloat;
		
		saveFloat = saveFloat * 10;
		thirdNumber = (int)saveFloat;
		saveFloat = saveFloat - (int)saveFloat;
		
		saveFloat = saveFloat * 10;
		fourthNumber = (int)(saveFloat + 0.5);
		saveFloat = saveFloat - (int)saveFloat;
		
		
		
		
		System.out.println("�Ҽ��� ù ��° �ڸ� �� : " + firstNumber);
		System.out.println("�Ҽ��� �� ��° �ڸ� �� : " + secondNumber);
		System.out.println("�Ҽ��� �� ��° �ڸ� �� : " + thirdNumber);
		System.out.println("�Ҽ��� �� ��° �ڸ� �� : " + fourthNumber);
		
	}

}
