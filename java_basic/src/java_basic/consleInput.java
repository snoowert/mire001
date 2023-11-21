package java_basic;

import java.util.Scanner;

public class consleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scann = new Scanner(System.in);
			
//			scann.nextInt(); //정수 입력
//			scann.nextFloat(); //실수 입력
			
			System.out.print("정수를 입력 : ");
			int inputInt = scann.nextInt();
			System.out.print("실수를 입력 : ");
			float inputFloat = scann.nextFloat();
			System.out.println();
			
			
			System.out.println("입력한 정수 : "+ inputInt);
			System.out.println("입력한 실수 : "+ inputFloat);
	}

}
