package java_basic;

public class LogicOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;

		result = ((a = 1) > (b = 2)) && ((c = 3) > 2);

		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("C : " + c);
		System.out.println("result : " + result);
		System.out.println("");

		a = 1;
		b = 2;
		c = 3;

		result = a < b || c > 2;

		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("C : " + c);
		System.out.println("result : " + result);
		 
	}

}
