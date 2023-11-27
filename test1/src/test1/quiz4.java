package test1;

import java.util.Scanner;

import quiz4.quizData;

public class quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quizData QD = new quizData();
		boolean repeat = false;
		Scanner scann = new Scanner(System.in);
		String inputCheck;

		do {
			QD.inputData();
			QD.printData();
			System.out.print("다시 하시겠습니까?(Y:N) : ");
			inputCheck = scann.nextLine();
			repeat = (inputCheck.toUpperCase().equals("Y"))? true:false;
		} while (repeat);
	}

}
