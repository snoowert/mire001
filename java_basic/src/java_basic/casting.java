package java_basic;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 120;
		short s = 3000;
		int i = 21;
		long l = 9l;
		float f = 1.2f;
		double d = 1.2; //double�� �ڿ� ���̴� ���� ����.
		
		b = (byte)i;
		System.out.println(b);
		
		System.out.println(s+i); // short + int ����
		System.out.println(s/i); // short / int ����
		System.out.println(s/f); // short / float ����
		System.out.println(s+f); // short + float ����

		System.out.println(1/2);
		System.out.println(1/2f);
		
		System.out.println("�� : "+ s/i);
		System.out.println("������ : "+ s%i);
	}

}
