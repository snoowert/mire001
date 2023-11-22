package java_basic;

public class refeatFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 2; i <= 50; i = i + 2) {
			sum = sum + i;
		}

		System.out.println("1ºÎÅÍ 50±îÁöÀÇ Â¦¼ö ÃÑÇÕÀº : " + sum);

		int gugudan = 0;
		String result = "";
		
		for (int i = 1; i < 10; i++) {
			gugudan = 2 * i;
			result = result + "2 * " + i + " = " + gugudan + "\n";
//			System.out.println("2 * " + i + " = " + gugudan);
		}
		
		
		System.out.println(result);
	}

}
