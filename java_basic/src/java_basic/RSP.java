package java_basic;

import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		// 가위 0 바위 1 보 2
		String com_rsp = "";
		int com_rsp_num = 0;
		String user_rsp = "";
		int user_rsp_num = 0;
		int menu = -1;
		// 승리 2 비김 1 패배 0
		String judge = "";

		String quit = "";

		do{
			com_rsp_num = (int) (Math.random() * 3);
			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은?");
			System.out.println("1.가위 2.바위 3.보");
			System.out.print(" : ");
			while (true) {
				menu = scann.nextInt();
				scann.nextLine();
				
				if(menu < 1 || menu > 3) {
					System.out.println("다시 선택하시길 바랍니다.");
				}
				else {
					break;
				}
			}
			user_rsp_num = menu - 1;
			switch (com_rsp_num) {
			case 0:
				com_rsp = "가위";
				break;
			case 1:
				com_rsp = "바위";
				break;
			case 2:
				com_rsp = "보";
				break;
			default:
				break;
			}

			switch (user_rsp_num) {
			case 0:
				user_rsp = "가위";
				break;
			case 1:
				user_rsp = "바위";
				break;
			case 2:
				user_rsp = "보";
				break;
			default:
				break;
			}

			if (com_rsp_num == ((user_rsp_num + 1) % 3)) {
				judge = "졌습니다.";
			} else if (com_rsp_num == user_rsp_num) {
				judge = "비겼습니다.";
			} else {
				judge = "이겼습니다.";
			}

			System.out.println("컴퓨터 : " + com_rsp);
			System.out.println("유저 : " + user_rsp);
			System.out.println(judge);

			System.out.println("계속 하시겠습니까?(중지 : Q)");
			System.out.println("계속하려면 아무키나 누르세요.");
			quit = scann.nextLine();
		}while (!quit.toUpperCase().equals("Q"));
	}
}
