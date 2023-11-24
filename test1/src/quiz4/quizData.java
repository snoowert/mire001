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
			System.out.println("1.삼각형 2.사각형 3.원");
			System.out.print("구하려는 넓이의 도형을 선택하십시오 : ");
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
				System.out.println("다시 입력하시길 바랍니다.");
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
