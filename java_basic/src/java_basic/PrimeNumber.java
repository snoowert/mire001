package java_basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isPrimeNumber = 0;
		Scanner scann = new Scanner(System.in);
		String result = "";
		boolean isPrime = false;

		System.out.print("���� �Է� : ");
		isPrimeNumber = scann.nextInt();

		for (int i = 2; i <= isPrimeNumber; i++) {
			if (isPrimeNumber % i != 0 || isPrimeNumber == i) {
				isPrime = true;
			} else {
				isPrime = false;
				break;
			}
		}

		result = (isPrime) ? "�Ҽ� �Դϴ�." : "�Ҽ��� �ƴմϴ�.";
		System.out.println(isPrimeNumber + "�� " + result);
	}

}
