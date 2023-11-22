package test1;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위 0 바위 1 보 2
		Scanner scann = new Scanner(System.in);
		int computerChoice = -1;
		int userChoice = -1;
		String result = " ";
		String Computer;
		String User;

		computerChoice = (int) (Math.random() * 3 + 1);
		if (computerChoice == 1)
			Computer = "가위";
		else if (computerChoice == 2)
			Computer = "바위";
		else
			Computer = "보";

		System.out.println("[ 가위 바위 보 게임 ]");
		System.out.println("컴퓨터는 결정했습니다.");
		System.out.print("당신의 차례입니다. (가위 1 / 바위 2 / 보 3 )");
		userChoice = scann.nextInt();

		if (userChoice == 1)
			User = "가위";
		else if (userChoice == 2)
			User = "바위";
		else {
			User = "보";
			userChoice = 3;
		}

		if (computerChoice == userChoice) {
			result = "비겼습니다.";
		} else {
			userChoice = userChoice + 1;
			if (userChoice > 3) {
				userChoice = userChoice - 3;
			}
			if (computerChoice == userChoice) {
				result = "졌습니다.";
			} else {
				result = "이겼습니다.";
			}
		}

		System.out.println("컴퓨터 : " + Computer);
		System.out.println("유저 : " + User);
		System.out.println(result);
	}

}
