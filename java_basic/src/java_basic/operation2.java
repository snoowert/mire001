package java_basic;

import java.util.Scanner;

public class operation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		float input = 0f;
		float output = 0f;
		
		System.out.print("�Ǽ� �Է� : ");
		input = scann.nextFloat();
		
		 
		output = (int)((input * 100 + 5) / 10)/10f;
		System.out.println("�Է°� : "+ input);
		System.out.println("�ݿø� : "+ output);
	}

}
