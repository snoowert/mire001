package quiz4;

import java.util.Scanner;

public class quizData {

	int sortingCode = -1;
	Scanner scann = new Scanner(System.in);

	triangle tri = new triangle();
	square sqr = new square();
	circle cir = new circle();

	public void inputData() {
		do {
			System.out.println("1.�ﰢ�� 2.�簢�� 3.��");
			System.out.print("���Ϸ��� ������ ������ �����Ͻʽÿ� : ");
			sortingCode = scann.nextInt();
			scann.nextLine();
			switch (sortingCode) {
			case 1:
				tri.inputData();
				break;
			case 2:
				sqr.inputData();
				break;
			case 3:
				cir.inputData();
				break;
			default:
				System.out.println("�ٽ� �Է��Ͻñ� �ٶ��ϴ�.");
				break;
			}
		} while (sortingCode < 1 || sortingCode > 3);
	}

	public void printData() {
		switch (sortingCode) {
		case 1:
			tri.outputData();
			break;
		case 2:
			sqr.outputData();
			break;
		case 3:
			cir.outputData();
			break;
		default:
			break;
		}
	}
}
