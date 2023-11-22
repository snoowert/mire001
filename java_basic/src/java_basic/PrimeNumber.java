package java_basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isPrimeNumber = 0;
		Scanner scann = new Scanner(System.in);
		String result = "";
		boolean isPrime = false;

		System.out.print("정수 입력 : ");
		isPrimeNumber = scann.nextInt();

		for (int i = 2; i <= isPrimeNumber; i++) {
			if (isPrimeNumber % i != 0 || isPrimeNumber == i) {
				isPrime = true;
			} else {
				isPrime = false;
				break;
			}
		}

		result = (isPrime) ? "소수 입니다." : "소수가 아닙니다.";
		System.out.println(isPrimeNumber + "는 " + result);
	}

}
