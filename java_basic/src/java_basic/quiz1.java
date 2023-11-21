package java_basic;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		int saveInt = 0; 		//입력된 값을 보존하기 위한 복사 변수
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		
		System.out.print("4자리 정수 입력 : ");
		inputInt = scann.nextInt();
		saveInt = inputInt;
		firstNumber = saveInt % 10;
		saveInt = saveInt / 10;
		secondNumber = saveInt % 10;
		saveInt = saveInt / 10;
		thirdNumber = saveInt % 10;
		saveInt = saveInt / 10;
		fourthNumber = saveInt;
		
		
		System.out.println("4번째 자리 수 : " + fourthNumber);
		System.out.println("3번째 자리 수 : " + thirdNumber);
		System.out.println("2번째 자리 수 : " + secondNumber);
		System.out.println("1번째 자리 수 : " + firstNumber);
	}

}
