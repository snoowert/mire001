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
		
		System.out.print("4자리 정수 입력 : ");
		inputInt = scann.nextInt();
	
		firstN = inputInt % 10;
		inputInt /= 10;
		secondN = inputInt % 10;
		inputInt /= 10;
		thirdN = inputInt % 10;
		inputInt /= 10;
		fourthN = inputInt % 10;
		
		System.out.println("4자리 숫자 : " + fourthN);
		System.out.println("3자리 숫자 : " + thirdN);
		System.out.println("2자리 숫자 : " + secondN);
		System.out.println("1자리 숫자 : " + firstN);
	}

}
