package com.java.io;

public class gugudan {

	public static String main() {
		// TODO Auto-generated method stub
		int num = 2;
		int gop = 9;

		String result = "";

		for (; num < 10; num++) {
			result += num + " ´Ü\n";
			for (gop = 1; gop < 10; gop++) {
				result += num + " * " + gop + " = " + num*gop + "\n";
			}
			result += "\n";
		}
//		System.out.println(result);
		return result;
	}

}
