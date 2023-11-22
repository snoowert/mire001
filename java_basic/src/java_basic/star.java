package java_basic;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		int inputInt = 0;
		Scanner scann = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		inputInt = scann.nextInt();
		
		
		for (int i = 1; i <= inputInt; i++) {
			for (int j = 1; j <= i; j++) {
				result = result + "*";
			}
			result = result + "\n";
		}

		System.out.println(result);

	}

}
