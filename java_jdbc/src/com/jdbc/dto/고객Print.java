package com.jdbc.dto;

import java.util.List;

public class 고객Print {
	public void 고객DataPrint(List<고객VO> list) {
		List<고객VO> 고객list = list;

		if (!고객list.isEmpty())
			for (int i = 0; i < 고객list.size(); i++) {
				고객VO 고객 = 고객list.get(i);

				System.out.println(고객.toString());
			}
		System.out.println("-----------");
	}
}
