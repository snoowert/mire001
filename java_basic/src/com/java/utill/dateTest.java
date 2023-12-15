package com.java.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String todayStr = "2022.09.26 11:03:22";

		try {
			Date theDay = format.parse(todayStr);
			System.out.println(theDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(format.format(today));
		System.out.println(today);

	}

}
