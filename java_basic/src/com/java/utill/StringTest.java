package com.java.utill;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzjsfajn;fabjnb;vajvaavlavl bvlvkavlavfa hklavf";
		
		System.out.println(str);
		System.out.println(str.charAt(11));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(10));
		System.out.println(str.substring(0,11));
		System.out.println(str.replace("ABC", "¤¡¤¤¤§"));
		System.out.println(str.contains("abc"));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.lastIndexOf("abc"));
		
		String str2 = "010-1234-5678";
		String[] strArray = str2.split("-");
		System.out.println(strArray[0]);
		System.out.println(str2.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$"));
	}

}
