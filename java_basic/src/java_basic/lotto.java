package java_basic;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45];
		int[][] lotto_sel;
		int temp = 0;
		int inputTax = 0;
		int change;
		int lottoCnt;
		final int price_lotto = 1000;
		int shuffleCnt = 0;

		Scanner scann = new Scanner(System.in);
		System.out.println("로또 1000원에 한장");
		System.out.print("결제할 금액은? : ");
		inputTax = scann.nextInt();
		lottoCnt = inputTax / price_lotto;
		change = inputTax % price_lotto;
		lotto_sel = new int[lottoCnt][6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		for (int i = 0; i < lotto_sel.length; i++) {
			shuffleCnt = 0;
			while (shuffleCnt < 45 * 100) {
				int target1 = (int) (Math.random() * 45);
				int target2 = (int) (Math.random() * 45);
				temp = lotto[target1];
				lotto[target1] = lotto[target2];
				lotto[target2] = temp;

				shuffleCnt++;
			}

			for (int j = 0; j < lotto_sel[i].length; j++) {
				lotto_sel[i][j] = lotto[j];
			}
		}

		for (int i = 0; i < lotto_sel.length; i++) {
			for (int j = 0; j < lotto_sel[i].length; j++) {
				System.out.print(lotto_sel[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("잔돈 : " + change + "원");
	}

}
