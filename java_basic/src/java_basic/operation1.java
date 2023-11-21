package java_basic;

import java.util.Scanner;

public class operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//worst case
		System.out.println("첫 번째 정수 : 3");
		System.out.println("두 번째 정수 : 5");
		System.out.println("더하기 : 8");
		System.out.println("빼기 : -2");
		System.out.println("곱하기 : 15");
		System.out.println("나누기 : 0.6");
		System.out.println();
		System.out.println("몫 : 1");
		System.out.println("나머지 : 2");
		System.out.println("-----------------\n");
		//One step better
		System.out.println("첫 번째 정수 : 3");
		System.out.println("두 번째 정수 : 5");
		System.out.println("더하기 : " + (3 + 5));
		System.out.println("빼기 : "+ (3 - 5));
		System.out.println("곱하기 : "+ (3 * 5));
		System.out.println("나누기 : "+ ((float)3 / 5));
		System.out.println();
		System.out.println("몫 : "+ (5 / 3));
		System.out.println("나머지 : "+ (5 % 3));
		System.out.println("-----------------\n");
		//One step better
		int a = 3;
		int b = 5;
		System.out.println("첫 번째 정수 : "+ a);
		System.out.println("두 번째 정수 : "+ b);
		System.out.println("더하기 : " + ((float)a + b));
		System.out.println("빼기 : "+ (a - b));
		System.out.println("곱하기 : "+ ((float)a * b));
		System.out.println("나누기 : "+ ((float)a / b));
		System.out.println();
		System.out.println("몫 : "+ (b / a));
		System.out.println("나머지 : "+ (b % a));
		System.out.println("-----------------\n");
		//One step better
		int firstInt = 3;
		int secondInt = 5;
		
		float sum = firstInt + secondInt;
		float minus = firstInt - secondInt;
		float multi = firstInt * secondInt;
		float divide = (float)firstInt / secondInt;
		
		int mock = secondInt / firstInt;
		int namezi = secondInt % firstInt;
		
		System.out.println("첫 번째 정수 : "+ firstInt);
		System.out.println("두 번째 정수 : "+ secondInt);
		System.out.println("더하기 : " + sum);
		System.out.println("빼기 : "+ minus);
		System.out.println("곱하기 : "+ multi);
		System.out.println("나누기 : "+ divide);
		System.out.println();
		System.out.println("몫 : "+ mock);
		System.out.println("나머지 : "+ namezi);
		System.out.println("-----------------\n");
		//One step better
		Scanner scann = new Scanner(System.in);
		int firstInput = 0;
		int secondInput = 0;
		
		float sum1 = 0f;
		float minus1 = 0f;
		float multi1 = 0f;
		float divide1 = 0f;
		
		int mock1 = 0;
		int namezi1 = 0;
		
		System.out.print("첫 번째 정수 입력 : ");
		firstInput = scann.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		secondInput = scann.nextInt();
		
		sum1 = firstInput + secondInput;
		minus1 = firstInput - secondInput;
		multi1 = firstInput * secondInput;
		divide1 = (float)firstInput / secondInput;
		
		mock1 = secondInput / firstInput;
		namezi1 = secondInput % firstInput;
		
		System.out.println("첫 번째 정수 : "+ firstInput);
		System.out.println("두 번째 정수 : "+ secondInput);
		System.out.println("더하기 : " + sum1);
		System.out.println("빼기 : "+ minus1);
		System.out.println("곱하기 : "+ multi1);
		System.out.println("나누기 : "+ divide1);
		System.out.println();
		System.out.println("몫 : "+ mock1);
		System.out.println("나머지 : "+ namezi1);
		System.out.println("-----------------\n");
	}

}
