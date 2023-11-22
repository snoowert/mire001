package java_basic;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		int dan = 2;
		int gop = 1;
		String result = "";

//		System.out.print("단 수 입력 : ");
//		dan = scann.nextInt();
		for (; dan < 10; dan++) {
			for (gop = 1; gop < 10; gop++) {
				result = result + (dan + " * " + gop + " = " + (dan * gop) + "\n");
			}
			result = result + "-----------\n";
		}

		System.out.println(result);
	}

}
