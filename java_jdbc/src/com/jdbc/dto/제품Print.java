package com.jdbc.dto;

import java.util.List;

public class 제품Print {

	public void 제품DataPrint(List<제품VO> list) {
		List<제품VO> 제품리스트 = list;
		
		if (!제품리스트.isEmpty())
			for (제품VO 제품 : 제품리스트) {
				System.out.println(제품.toString());
			}
		System.out.println("-----------");
	}
}
