package java_basic;

import java.util.Scanner;

public class operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//worst case
		System.out.println("ù ��° ���� : 3");
		System.out.println("�� ��° ���� : 5");
		System.out.println("���ϱ� : 8");
		System.out.println("���� : -2");
		System.out.println("���ϱ� : 15");
		System.out.println("������ : 0.6");
		System.out.println();
		System.out.println("�� : 1");
		System.out.println("������ : 2");
		System.out.println("-----------------\n");
		//One step better
		System.out.println("ù ��° ���� : 3");
		System.out.println("�� ��° ���� : 5");
		System.out.println("���ϱ� : " + (3 + 5));
		System.out.println("���� : "+ (3 - 5));
		System.out.println("���ϱ� : "+ (3 * 5));
		System.out.println("������ : "+ ((float)3 / 5));
		System.out.println();
		System.out.println("�� : "+ (5 / 3));
		System.out.println("������ : "+ (5 % 3));
		System.out.println("-----------------\n");
		//One step better
		int a = 3;
		int b = 5;
		System.out.println("ù ��° ���� : "+ a);
		System.out.println("�� ��° ���� : "+ b);
		System.out.println("���ϱ� : " + ((float)a + b));
		System.out.println("���� : "+ (a - b));
		System.out.println("���ϱ� : "+ ((float)a * b));
		System.out.println("������ : "+ ((float)a / b));
		System.out.println();
		System.out.println("�� : "+ (b / a));
		System.out.println("������ : "+ (b % a));
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
		
		System.out.println("ù ��° ���� : "+ firstInt);
		System.out.println("�� ��° ���� : "+ secondInt);
		System.out.println("���ϱ� : " + sum);
		System.out.println("���� : "+ minus);
		System.out.println("���ϱ� : "+ multi);
		System.out.println("������ : "+ divide);
		System.out.println();
		System.out.println("�� : "+ mock);
		System.out.println("������ : "+ namezi);
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
		
		System.out.print("ù ��° ���� �Է� : ");
		firstInput = scann.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		secondInput = scann.nextInt();
		
		sum1 = firstInput + secondInput;
		minus1 = firstInput - secondInput;
		multi1 = firstInput * secondInput;
		divide1 = (float)firstInput / secondInput;
		
		mock1 = secondInput / firstInput;
		namezi1 = secondInput % firstInput;
		
		System.out.println("ù ��° ���� : "+ firstInput);
		System.out.println("�� ��° ���� : "+ secondInput);
		System.out.println("���ϱ� : " + sum1);
		System.out.println("���� : "+ minus1);
		System.out.println("���ϱ� : "+ multi1);
		System.out.println("������ : "+ divide1);
		System.out.println();
		System.out.println("�� : "+ mock1);
		System.out.println("������ : "+ namezi1);
		System.out.println("-----------------\n");
	}

}
