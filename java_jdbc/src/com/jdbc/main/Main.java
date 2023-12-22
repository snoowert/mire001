package com.jdbc.main;

import com.jdbc.controller.고객Controller;
import com.jdbc.controller.MainController;

public class Main {

	private MainController mainC = new MainController();
	private 고객Controller 고객C = new 고객Controller();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		while (true) {
			main.start();
		}
	}

	private void start() {
		String menu = mainC.menu();

		switch (menu) {
		case "1":// 고객리스트
			고객C.list();
			break;
		case "2":// 제품리스트
			System.out.println("서비스준비중입니다.");
			break;
		case "3":// 주문리스트
			System.out.println("서비스준비중입니다.");
			break;
		case "q":
		case "Q":// 종료
			System.out.println("프로그램을 종료 합니다.");
			System.exit(0);
			break;
		default:// 나머지
			System.out.println("메뉴 선택이 올바르지 않습니다.\t");
		}
	}
}
