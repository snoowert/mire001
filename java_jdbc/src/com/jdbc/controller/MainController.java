package com.jdbc.controller;

import java.util.Scanner;

public class MainController {

	public String menu() {
		System.out.println("1. 고객리스트 \t2. 제품리스트 \t3.주문리스트");
		System.out.println("메뉴를 선택하세요(종료:q)_");
		
		Scanner scann = new Scanner(System.in);
		String menu = scann.nextLine();
		return menu;
	}
}
