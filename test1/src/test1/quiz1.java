package test1;


import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputInt = 0;
		Scanner scann = new Scanner(System.in);
		int firstN = 0;
		int secondN = 0;
		int thirdN = 0;
		int fourthN = 0;
		
		System.out.print("4�ڸ� ���� �Է� : ");
		inputInt = scann.nextInt();
	
		firstN = inputInt % 10;
		inputInt /= 10;
		secondN = inputInt % 10;
		inputInt /= 10;
		thirdN = inputInt % 10;
		inputInt /= 10;
		fourthN = inputInt % 10;
		
		System.out.println("4�ڸ� ���� : " + fourthN);
		System.out.println("3�ڸ� ���� : " + thirdN);
		System.out.println("2�ڸ� ���� : " + secondN);
		System.out.println("1�ڸ� ���� : " + firstN);
	}

}
