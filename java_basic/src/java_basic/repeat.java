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
		
		System.out.print("소수점 네 자리 실수 입력 : ");
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
		
		
		
		
		System.out.println("소수점 첫 번째 자리 수 : " + firstNumber);
		System.out.println("소수점 두 번째 자리 수 : " + secondNumber);
		System.out.println("소수점 세 번째 자리 수 : " + thirdNumber);
		System.out.println("소수점 네 번째 자리 수 : " + fourthNumber);
		
	}

}
