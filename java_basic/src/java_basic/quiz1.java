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
		
		System.out.print("4자리 정수 입력 : ");
		inputInt = scann.nextInt();
		
		firstNumber = inputInt % 10;
		inputInt = inputInt / 10;
		secondNumber = inputInt % 10;
		inputInt = inputInt / 10;
		thirdNumber = inputInt % 10;
		inputInt = inputInt / 10;
		fourthNumber = inputInt;
		
		
		System.out.println("4번째 자리 수 : " + fourthNumber);
		System.out.println("3번째 자리 수 : " + thirdNumber);
		System.out.println("2번째 자리 수 : " + secondNumber);
		System.out.println("1번째 자리 수 : " + firstNumber);
	}

}
