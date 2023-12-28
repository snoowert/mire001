package com.java.middleTest;

public class middleTest {
//	static void method(boolean b) {
//		try {
//			System.out.println(1);
//			if(b) System.exit(0);
//			System.out.println(2);
//		}catch(RuntimeException r) {
//			System.out.println(3);
//			return;
//		}catch(Exception e){
//			System.out.println(4)
//		}
//	}

	public static void method(String str) {
		str += "456";
	}

	public static void bubble(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
			System.out.println("\n");
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}//if
			}//for2
		}//for1
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}//bubble
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr[];
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = new int[3];
		// int[] arr4 = new int[5] {1,2,3,4,5};
		// int arr5[5];
		int[] arr6[] = new int[3][];

		System.out.println(arr3.length);

		String str = "ABC123";
		System.out.println(str);
		method(str);
		System.out.println(str);

		int[] arr11 = { 21, 7, 82, 45, 60, 17, 29, 38, 51, 75 };
		
		bubble(arr11);
		
		String value = "12o34";
		char ch;
		for(int i = 0; i < value.length();i++) {
			ch = value.charAt(i);
			if(ch<'0'||ch>'9')
				System.out.println("숫자아님");
		}
	}

}
