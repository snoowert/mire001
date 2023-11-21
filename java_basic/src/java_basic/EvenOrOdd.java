package java_basic;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int inputInt = 0;
		char judge = ' ';
		System.out.print("정수 하나를 입력하시오. : ");
		inputInt = scann.nextInt();
		
		if(inputInt % 2 == 0)
			judge = '짝';
		else
			judge = '홀';
			
		System.out.println("입력한 정수 " + inputInt +"는 "+ judge +"수입니다.");
	}

}
