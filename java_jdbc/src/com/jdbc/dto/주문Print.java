package com.jdbc.dto;

import java.util.List;

public class 주문Print {

	public void 주문DataPrint(List<주문VO> list) {
		List<주문VO> 주문리스트 = list;
		
		if (!주문리스트.isEmpty())
			for (int i = 0; i < 주문리스트.size(); i++) {
				주문VO 주문 = 주문리스트.get(i);

				System.out.println(주문.toString());
			}
		System.out.println("-----------");
	}
}
