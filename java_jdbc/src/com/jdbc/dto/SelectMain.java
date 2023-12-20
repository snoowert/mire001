package com.jdbc.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean continueB = true;
		Scanner scann = new Scanner(System.in);
		String Select;
		do {
			System.out.println("1.고객 2.제품 3.주문");
			System.out.print("확인하실 항목을 선택해주세요.(종료:q) : ");
			Select = scann.nextLine();
			if (Select.equals("q"))
				return;
			int typeNumber = Integer.parseInt(Select);
			if (typeNumber <= 0 || typeNumber > 3) {
				System.out.println("다시 입력해주세요.");
				continue;
			}
			switch (typeNumber) {
			case 1:
				List<고객VO> 고객리스트 = new ArrayList<고객VO>();

				고객리스트 = new 고객Load().고객DataLoad();
				new 고객Print().고객DataPrint(고객리스트);
				break;
			case 2:
				List<제품VO> 제품리스트 = new ArrayList<제품VO>();
				제품리스트 = new 제품Load().제품DataLoad();

				new 제품Print().제품DataPrint(제품리스트);
				break;
			case 3:
				List<주문VO> 주문리스트 = new ArrayList<주문VO>();

				주문리스트 = new 주문Load().주문DataLoad();
				new 주문Print().주문DataPrint(주문리스트);
				break;
			}
			System.out.print("계속 하시겠습니까?(중지 : N)");
			String Con = scann.nextLine();
			if (Con.equals("N") || Con.equals("n"))
				continueB = false;
		} while (continueB);

	}

}
